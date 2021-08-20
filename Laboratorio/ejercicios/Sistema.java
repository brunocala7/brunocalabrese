package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {
    private ArrayList<Producto> listaProductos;

    public Sistema (){
        this.listaProductos = new ArrayList<>();
    }

    public void iniciarSistema(){
        System.out.println("1. Registrar producto");
        System.out.println("2. Mostrar precio parcial");
        System.out.println("3. Finalizar compra");
    }

    public void registrarProductos(){
        Producto p1 = new Producto("kfop", 0.0F);
        Scanner sc_string = new Scanner(System.in);
        Scanner sc_int = new Scanner(System.in);

        System.out.print("Ingrese el nombre del producto: ");
        p1.setNombre(sc_string.nextLine());

        System.out.print("Ingrese el precio del producto: ");
        p1.setPrecio(sc_int.nextFloat());

        this.listaProductos.add(p1);
    }

    public void verImporteParcial (){
        float total = 0;

        for (Producto producto : listaProductos){
            total += producto.getPrecio();
        }

        System.out.println("Precio parcial: " + total);
    }

    public void verImporteTotal (){
        float total = 0;

        for (Producto producto : listaProductos){
            total += producto.getPrecio();
        }

        System.out.println("Precio total: " + total);
    }



}
