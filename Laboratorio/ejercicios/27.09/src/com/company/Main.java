package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Producto p1 = new Producto(1,"banana",43,90.5f);
        Producto p2 = new Producto(2,"manzana",522,75f);
        Producto p3 = new Producto(3,"pelota",43,90.5f);

        Tienda tienda = new Tienda();
        ArrayList<Producto> vendidos = new ArrayList<>();
        ArrayList<Producto> ofertados = new ArrayList<>();

        vendidos.add(p1);
        vendidos.add(p2);
        vendidos.add(p1);
        vendidos.add(p1);

        tienda.setVendidos(vendidos);

        for(String nombre : tienda.nombresDeProductosVendidos()){
            System.out.println(nombre);
        }
    }
}
