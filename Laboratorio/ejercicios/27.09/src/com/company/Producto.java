package com.company;

public class Producto {
    public static float descuento = 30f;
    private int id;
    private String nombre;
    private int stock;
    private float precio;

    public Producto(int id, String nombre, int stock, float precio) {
        this.id = id;
        this.nombre = nombre;
        this.stock = stock;
        this.precio = precio;
    }

    public float precioConDescuento (){
        float precio = 0;
        float precioProducto = this.getPrecio();

        precio =  precioProducto - precioProducto * (descuento/100);

        return precio;
    }


    public static void imprimirInformacion(Producto p){
        System.out.println("Id: " + p.id);
        System.out.println("Nombre: " + p.nombre);
        System.out.println("Stock: " + p.stock);
        System.out.println("Precio: " + p.precio);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}

