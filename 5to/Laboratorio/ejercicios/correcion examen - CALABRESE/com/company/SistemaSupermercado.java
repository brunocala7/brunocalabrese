package com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class SistemaSupermerpackage com.company;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.*;

public class SistemaSupermercado implements SistemaDeVentas{
    private String nombre;
    private HashSet<Object> productosALaVenta;
    private ArrayList<Object> productosVendidos;

    public SistemaSupermercado(String nombre, HashSet<Object> productosALaVenta, ArrayList<Object> productosVendidos) {
        this.nombre = nombre;
        this.productosALaVenta = productosALaVenta;
        this.productosVendidos = productosVendidos;
    }

    public void agregarProductoVendido(){
        /**
         Que deberá recibir, por consola, los valores correspondientes a los atributos del producto vendido para luego crear la instancia del mismo.

         Considerar la posibilidad de que el usuario ingrese un valor de un tipo no esperado y tratar esta situación con InputMismatchException.

         En caso de que suceda, se deberán pedir todos los datos nuevamente.
         **/
        Scanner scannerDeOpcion = new Scanner(System.in);
        Scanner scannerDeIngreso = new Scanner(System.in);

        try{
            System.out.println("MENU INGRESO PRODUCTO");
            System.out.println("1- Producto de calefaccion");
            System.out.println("2- Producto de refrigeracion");
            System.out.println("3- Producto perecedero");
            System.out.println("4- Producto no perecedero");

            int opcion = scannerDeOpcion.nextInt();
            System.out.print("Nombre: ");
            String nombre = scannerDeIngreso.nextLine();
            System.out.print("Origen: ");
            String origen = scannerDeIngreso.nextLine();
            System.out.print("Codigo: ");
            int codigo = scannerDeIngreso.nextInt();
            System.out.print("Costo: ");
            int costo = scannerDeIngreso.nextInt();
            if(opcion == 1 || opcion == 2){
                System.out.print("Dias de garantia: ");
                int diasDeGarantia = scannerDeIngreso.nextInt();
                switch (opcion){
                    case 1:
                        System.out.print("Watts de potencia: ");
                        int wattsDePotencia = scannerDeIngreso.nextInt();
                        ProductoDeCalefaccion productoDeCalefaccion = new ProductoDeCalefaccion(nombre,origen,codigo,costo,diasDeGarantia,wattsDePotencia);
                        this.productosVendidos.add(productoDeCalefaccion);
                        break;
                    case 2:
                        System.out.print("Litros de capacidad: ");
                        float litrosDeCapacidad = scannerDeIngreso.nextFloat();
                        ProductoDeRefrigeracion productoDeRefrigeracion = new ProductoDeRefrigeracion(nombre,origen,codigo,costo,diasDeGarantia,litrosDeCapacidad);
                        this.productosVendidos.add(productoDeRefrigeracion);
                        break;
                }
            }
            else if(opcion == 3 || opcion == 4){
                System.out.print("Dias de vencimiento");
                int diasDeVencimiento = scannerDeIngreso.nextInt();
                switch (opcion){
                    case 3:
                        System.out.print("Temperatura minima de frio: ");
                        int temperaturaMinimaDeFrio = scannerDeIngreso.nextInt();
                        ProductoPerecedero productoPerecedero = new ProductoPerecedero(nombre,origen,codigo,costo,diasDeVencimiento,temperaturaMinimaDeFrio)
                        this.productosVendidos.add(productoPerecedero);
                        break;
                    case 4:
                        System.out.print("Miligramos de Sodio: ");
                        int miligramos = scannerDeIngreso.nextInt();
                        ProductoNoPerecedero productoNoPerecedero = new ProductoNoPerecedero(nombre,origen,codigo,costo,diasDeVencimiento,miligramos);
                        this.productosVendidos.add(productoNoPerecedero);
                        break;
                }
            }
        } catch(InputMismatchException e){
            e.printStackTrace();
        }


    }

    public static String serializarObjeto(Object objeto)  {
        ObjectMapper mapper = new ObjectMapper();
        String objetoSerializado = null;
        try {
            objetoSerializado = mapper.writeValueAsString(objeto);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return objetoSerializado;
    }

    public static HashMap serializarObjeto(String objetoSerializado)  {
        ObjectMapper mapper = new ObjectMapper();
        HashMap objetoDesserializado = null;
        try {
            objetoDesserializado = mapper.readValue(objetoSerializado, HashMap.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return objetoDesserializado;
    }

    public HashSet<String> aptosParaHipertensos(){
        HashSet<String> aptosHipertensos = new HashSet<>();

        for(Object producto : this.productosALaVenta){
            if(producto.tipoDeProducto() == "Producto No Perecedero"){
                aptosHipertensos.add(producto.getNombre());
            }
        }

        return aptosHipertensos;
    }

    public HashMap<Integer,Float> productosRefrigerantesConGranCapacidad(){
        HashMap<Integer,Float> productosRefrigerantes = new HashMap<>();

        for(Object objeto : this.productosALaVenta){
            if(objeto.tipoDeProducto() == "Producto De Refrigeracion"){
                if(objeto.getOrigen() == "argentino" && objeto.getLitrosDeCapacidad() >= 300){
                    productosRefrigerantes.put(objeto.getCodigo,objeto.getLitrosDeCapacidad);
                }
            }
        }

        return productosRefrigerantes;
    }

    ///////////////////////////////CORRECION/////////////////////////////////////////////////////////

    @Override
    public float gananciaTotalObtenida() {
        float ganancioTotal = 0.f;
        for(Object producto : this.productosVendidos){
            ganancioTotal += producto.calcularGananciaObtenida();
        }

        return ganancioTotal;
    }

    @Override
    public float ingresosTotales() {
        float ingresosTotales = 0.f;
        for(Object producto : this.productosVendidos){
            ingresosTotales += producto.calcularPrecioFinal();
        }

        return ingresosTotales;
    }

    @Override
    public int cantidadDeProductosVendidos() {
        return this.productosVendidos.size();
    }

    ///////////////////////////////CORRECION/////////////////////////////////////////////////////////

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Object> getProductosALaVenta() {
        return productosALaVenta;
    }

    public void setProductosALaVenta(HashSet<Object> productosALaVenta) {
        this.productosALaVenta = productosALaVenta;
    }

    public ArrayList<Object> getProductosVendidos() {
        return productosVendidos;
    }

    public void setProductosVendidos(ArrayList<Object> productosVendidos) {
        this.productosVendidos = productosVendidos;
    }

}
