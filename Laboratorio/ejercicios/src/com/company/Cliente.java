package com.company;

import java.util.HashMap;

public class Cliente {
    private int id;
    private HashMap <Libro,Integer> unidadesPorLibro;

    public Cliente (int id){
        this.id = id;
        this.unidadesPorLibro = new HashMap<>();
    }

    public Integer getId () {
        return this.id;
    }

    public HashMap <Libro,Integer> getUnidadesPorLibro () {
        return this.unidadesPorLibro;
    }

    public void setId (int n) {
        this.id = n;
    }

    public void setUnidadesPorLibro (Libro l1,int cant_libros){
        this.unidadesPorLibro.replace(l1, cant_libros);
    }

    public void agregarUnidadPorLibro (Libro l1) {
        this.unidadesPorLibro.put(l1, 1);
    }

    public void mostrarComprasCliente () {
        for (Libro l1 : unidadesPorLibro.keySet()){

            System.out.println(l1.getNombre()+" - " + unidadesPorLibro.get(l1) + " unidades - " + (l1.getPrecio() * unidadesPorLibro.get(l1)) + "$");
        }
    }
}