package com.company;

import java.util.HashMap;

public class AppParaDeposito {
    public static void main(String[] args) {
        Producto p1 = new Producto("COCA COLA", 45.2f);    
        Producto p2 = new Producto("Seven Up", 50f);    
        Producto p3 = new Producto("Carne", 500f);    
        Producto p4 = new Producto("Caramelo", 5.75f);    
        Producto p5 = new Producto("Kit Kat", 90f);    

        HashMap<Producto,Integer> listaDeposito = new HashMap<>();

        AppParaDeposito deposito = new AppParaDeposito();

        //INGRESO PRODUCTOS
        deposito.ingresarProducto(p1);
        deposito.ingresarProducto(p2);
        deposito.ingresarProducto(p3);
        deposito.ingresarProducto(p4);
        deposito.ingresarProducto(p5);

        //INGRESO UNIDADES
        deposito.ingresarUnidad(p1);
        deposito.ingresarUnidad(p1);
        deposito.ingresarUnidad(p1);
        deposito.ingresarUnidad(p1);

        deposito.ingresarUnidad(p2);
        deposito.ingresarUnidad(p2);
        deposito.ingresarUnidad(p2);

        deposito.ingresarUnidad(p4);
        deposito.ingresarUnidad(p4);
        deposito.ingresarUnidad(p4);
        deposito.ingresarUnidad(p4);

        deposito.ingresarUnidad(p5);
        deposito.ingresarUnidad(p5);
        deposito.ingresarUnidad(p5);
        deposito.ingresarUnidad(p5);
        deposito.ingresarUnidad(p5);
        deposito.ingresarUnidad(p5);
        deposito.ingresarUnidad(p5);

        deposito.stockActual("Carne");

        deposito.stockActual("COCA COLA");

        deposito.productosSinStock();

        deposito.menosDeQuince();

        deposito.valorDeposito();

        deposito.egresarProducto("Kit Kat");

        deposito.valorDeposito();
    }


    private HashMap<Producto,Integer> stockPorProducto;

    public AppParaDeposito (){
        this.stockPorProducto = new HashMap<>();
    }

    public void ingresarProducto (Producto p1){
        this.stockPorProducto.put(p1,0);
    }

    public void ingresarUnidad (Producto p1){
        int stock = 0;
        stock = this.stockPorProducto.get(p1);
        stock++;
        this.stockPorProducto.replace(p1,stock);
    }

    public void egresarProducto (String nombre){
        for (Producto p1 : this.stockPorProducto.keySet()) {
            if(p1.getNombre() == nombre){
                this.stockPorProducto.remove(p1);
            }
        }
    }

    public void egresarUnidad (Producto p1){
        int stock = 0;
        stock = this.stockPorProducto.get(p1);
        stock--;
        this.stockPorProducto.replace(p1,stock);
    }

    public void valorDeposito() {
        int monto = 0;
        int stock = 0;

        for (Producto p1 : this.stockPorProducto.keySet()) {
            stock = this.stockPorProducto.get(p1);
            monto += p1.getPrecio() * stock;
        }

        System.out.println("El valor del stock es: " + monto);
    }

    public void productosSinStock() {
        String lista = new String();

        for(Producto p1 : this.stockPorProducto.keySet()){
            if(this.stockPorProducto.get(p1) == 0){
                if(lista.length() != 0){
                    lista = lista + ", " + p1.getNombre();
                }
                else{
                    lista = "Los productos con 0 stock son: " + p1.getNombre();
                }
            }
        }

        if(lista.length() == 1){
            System.out.println("No hay productos sin unidades");
        }
    }

    public void stockActual(String nombre) {
        for (Producto p1 : this.stockPorProducto.keySet()) {
            if(p1.getNombre() == nombre){
                System.out.println("El stock de " + p1.getNombre() + " es " + this.stockPorProducto.get(p1));
            }
        }
    }

    public void menosDeQuince() {
        String lista = "";
        for (Producto p1 : this.stockPorProducto.keySet()) {
            if(this.stockPorProducto.get(p1) < 15){
                if(lista.length() != 0){
                    lista = lista + ", " + p1.getNombre();
                }
                else{
                    lista = "Los productos con menos de 15 unidades son: " + p1.getNombre();
                }
            }
        }

        if(lista.length() == 0){
            System.out.println("No hay productos con menos de 15 unidades");
        }
    }
}


/*
Crear una aplicación para administrar un depósito de productos alimenticios.

Funcionalidades de la aplicación:

Realizar el registro de productos que ingresan y egresan
Imprimir el valor monetario equivalente al stock presente en el depósito. (tener en cuenta que el ingreso y egreso de productos modificarán 
tal monto)
Imprimir cuáles son los productos sin stock.
Imprimir cuál es el stock actual de algún producto según el nombre.
Imprimir cuáles son los productos que tienen menos de 15 unidades.
Comentarios:

Uilizar la clase producto alimenticio que fué creada anteriormente.
Crear la clase "AppParaDeposito" y colocar allí los métodos necesarios (incluido el método main) para cumplir las funcionalidades requeridas.
Comentario muy importante:

Tener en cuenta que queremos que nuestro código sea reutilizable y fácil de comprender. Recomiendo que piensen que el código que escriben volverá a ser leido por ustedes (o por otras personas) en el futuro 
y tendrán que volver a entender lo que quisieron hacer.
*/