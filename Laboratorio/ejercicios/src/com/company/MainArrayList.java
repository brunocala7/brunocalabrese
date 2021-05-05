package com.company;
import java.util.ArrayList;
import java.util.Scanner;


public class MainArrayList {
    public float calcular_total(ArrayList<Producto> productos){
        float total = 0;

        for (Producto producto : productos) {
            total += producto.getPrecio();
        }

        return total;

    }

    public static void main (String[] args){
        MainArrayList sistema = new MainArrayList();
        float precio;
        String opcion;
        String nombre;
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_float = new Scanner(System.in);
        ArrayList<Producto> productos = new ArrayList<>();


        while(true){
            System.out.println("REGISTRO DE PRODUCTOS");
            System.out.println("Importe Parcial: " + sistema.calcular_total(productos));
            System.out.print("Nombre del producto: ");
            nombre = sc_string.nextLine();
            System.out.print("Precio del producto: ");
            precio = sc_float.nextFloat();

            Producto p1 = new Producto(nombre,precio);

            productos.add(p1);

            System.out.println("0 -> Continuar compra");
            System.out.println("1 -> Finalizar compra");
            System.out.println("Importe parcial: " + sistema.calcular_total(productos));

            opcion = sc_string.nextLine();

            if (opcion.equals("1")){
                break;
            }
        }

        System.out.println("Importe total: " + sistema.calcular_total(productos));
    }
}
