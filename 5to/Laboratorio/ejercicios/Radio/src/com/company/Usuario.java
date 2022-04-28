package com.company;

public class Usuario {
    private String nombre;
    private String apellido;
    private int dni;
    private String fechaAlta;

    public Usuario(String nombre, String apellido, int dni, String fechaAlta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaAlta = fechaAlta;
    }

    public Usuario() {
        this.nombre = "";
        this.apellido = "";
        this.dni = 0;
        this.fechaAlta = "";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(String fechaAlta) {
        this.fechaAlta = fechaAlta;
    }
}
