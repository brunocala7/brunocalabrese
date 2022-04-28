package com.company;

public class Libro {
    private String nombre;
    private float precio;
    private String editorial;

    public Libro(String nombre, float precio, String editorial){
        this.nombre = nombre;
        this.precio = precio;
        this.editorial = editorial;
    }

    public String getNombre(){
        return this.nombre;
    }

    public Float getPrecio(){
        return this.precio;
    }

    public String getEditorial(){
        return this.editorial;
    }
}