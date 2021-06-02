package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.ArrayList;

public class MainLibros {

    public static void main (String[] args) {
        Scanner sc_float = new Scanner(System.in);
        Scanner sc_string = new Scanner(System.in);

        HashMap<String,Integer> editorialesCantidad = new HashMap<>();

        HashSet <Cliente> listaClientes = new HashSet<>(); 

        ArrayList <Libro> listaLibros = new ArrayList<>();

        String nombre;
        float precio;
        String editorial;
        String seguirONo;
        
        while (true){
            System.out.println("¿Qué libro desea comprar?");
            System.out.print("Nombre: ");
            nombre = sc_string.nextLine();
            System.out.print("Precio: ");
            precio = sc_float.nextFloat();
            System.out.print("Editorial: ");
            editorial = sc_string.nextLine();

            Libro libro1 = new Libro(nombre, precio, editorial);

            listaLibros.add(libro1);

            System.out.println("¿Desea agregar otro libro? Escriba 'no' para terminar el sistema");
            seguirONo = sc_string.nextLine();

            if(seguirONo.equals("no")){
                break;
            }
        }

        //calculo de cantidad de libros vendidos por editorial

        for (Libro l1 : listaLibros) {
            String nombre_editorial = l1.getEditorial();
            if(editorialesCantidad.containsKey(nombre_editorial)){
                editorialesCantidad.replace(nombre_editorial, editorialesCantidad.get(nombre_editorial) + 1);
            }
            else{
                editorialesCantidad.put(nombre_editorial, 1);
            }
        }

        System.out.println(editorialesCantidad);

        int max_cantidad = 0;
        int par_cantidad = 0;
        String editorialConMasVentas = "";

        for (String nombreClave : editorialesCantidad.keySet()) {
            par_cantidad = editorialesCantidad.get(nombreClave);

            if(par_cantidad >= max_cantidad){
                max_cantidad = par_cantidad;
                editorialConMasVentas = nombreClave;
            }
        }
        
        System.out.println("La editorial que más libros vendió fue " + editorialConMasVentas);

        
    }
}