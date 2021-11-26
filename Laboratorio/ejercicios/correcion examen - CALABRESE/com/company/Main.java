package com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ProductoDeCalefaccion productoDeCalefaccion = new ProductoDeCalefaccion("tablet","argentina",12,4500,60,45.f);
        SistemaSupermercado sistemaSupermercado = new SistemaSupermercado("sfmdosf",new HashSet<Object>(),new ArrayList<>());

        String nashe = sistemaSupermercapackage com.company;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args) {
        ProductoDeCalefaccion productoDeCalefaccion = new ProductoDeCalefaccion("tablet","argentina",12,4500,60,45.f);
        SistemaSupermercado sistemaSupermercado = new SistemaSupermercado("sfmdosf",new HashSet<Object>(),new ArrayList<>());

        String nashe = sistemaSupermercado.serializarObjeto(productoDeCalefaccion);
        System.out.println(nashe);
    }
}
