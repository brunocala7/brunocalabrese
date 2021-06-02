package com.company;

import java.util.HashSet;
import java.util.HashMap;


public class Libreria {
    private HashSet <String> editorialesConDescuentos;
    private HashMap <Cliente,Libro> ventas;

    public Libreria (){
        this.editorialesConDescuentos = new HashSet<>();
        this.ventas = new HashMap<>();
    }

    public HashSet <String> getEditorialesConDescuentos (){
        return this.editorialesConDescuentos;
    }

    public HashMap <Cliente,Libro> getVentas () {
        return this.ventas;
    }

    public void agregarEditorial (String editorial){
        this.editorialesConDescuentos.add(editorial);
    }

    public void agregarVenta (Cliente c1,Libro l1){
        this.ventas.put(c1,l1);
    }
}
