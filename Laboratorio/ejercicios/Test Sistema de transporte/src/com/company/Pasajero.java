package com.company;

public class Pasajero {
    private String nombre;
    private String apellido;
    TarjetaEquis tarjeta;

    public Pasajero (){
        this.nombre = "Cosme";
        this.apellido = "Fulanito";
        this.tarjeta = new TarjetaEquis(10.f,-50.f,2f);
    }

    public Pasajero (String nombre,String apellido,TarjetaEquis tar){
        this.nombre = nombre;
        this.apellido = apellido;
        this.tarjeta = tar;
    }

    //GETTERS 
    public String getNombre (){
        return this.nombre;
    }

    public String getApellido (){
        return this.apellido;
    }

    public TarjetaEquis getTarjeta (){
        return this.tarjeta;
    }

    //SETTERS
    public void setNombre(String nom) {
        this.nombre = nom;
    }

    public void setApellido(String ape) {
        this.apellido = ape;
    }

    public void setTarjeta(TarjetaEquis t){
        this.tarjeta = t;
    }
}
