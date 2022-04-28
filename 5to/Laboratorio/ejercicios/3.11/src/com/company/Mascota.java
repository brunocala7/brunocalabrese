package com.company;

public class Mascota {
    private String nombre;
    private String tipo;
    private String nombreDueño;

    public Mascota(String nombre, String tipo, String nombreDueño) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.nombreDueño = nombreDueño;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }
}
