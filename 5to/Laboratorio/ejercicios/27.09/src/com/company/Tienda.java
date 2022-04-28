package com.company;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Tienda {
    private ArrayList<Producto> ofertados;
    private ArrayList<Producto> vendidos;

    public Tienda(){
        this.ofertados = new ArrayList<>();
        this.vendidos = new ArrayList<>();
    }


    public void registrarVenta(Producto productoVendido){
        vendidos.add(productoVendido);
    }

    public HashMap<Producto,Integer> ventasPorProducto(){
        HashMap<Producto,Integer> ventasPorProducto = new HashMap<>();
        for (Producto producto : vendidos) {
            if(ventasPorProducto.containsKey(producto)){
                int valorNuevo = ventasPorProducto.get(producto) + 1;
                ventasPorProducto.replace(producto,valorNuevo);
            }
            else{
                ventasPorProducto.put(producto,0);
            }
        }
        return ventasPorProducto;
    }

    public HashSet<Producto> productosMasVendidos(){
        HashSet<Producto> productosConMasDe5Ventas = new HashSet<>();
        HashMap<Producto,Integer> cantidadDeVentas = ventasPorProducto();
        for (Producto producto : cantidadDeVentas.keySet()) {
            int cantidadActual = cantidadDeVentas.get(producto);
            if(cantidadActual >= 5){
                productosConMasDe5Ventas.add(producto);
            }
        }

        return productosConMasDe5Ventas;
    }

    public HashSet<String> nombresDeProductosVendidos(){
        HashSet<String> productosVendidos = new HashSet<>();
        for (Producto producto : this.getVendidos()){
            productosVendidos.add(producto.getNombre());
        }
        return productosVendidos;
    }

    public ArrayList<Producto> getOfertados() {
        return ofertados;
    }

    public void setOfertados(ArrayList<Producto> ofertados) {
        this.ofertados = ofertados;
    }

    public ArrayList<Producto> getVendidos() {
        return vendidos;
    }

    public void setVendidos(ArrayList<Producto> vendidos) {
        this.vendidos = vendidos;
    }
}
