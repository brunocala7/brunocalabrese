package com.company;


public class Persona {
    private String nombre;
    private String apellido;
    private int edad;

    public Persona(){
        this.nombre = "Roberto";
        this.apellido = "Linterna";
        this.edad = 68;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public static void imprimir(Persona p1){
        System.out.println(p1.toString());
    }

    @Override
    public String toString(){
        String mensaje;
        mensaje = "Nombre: " + this.nombre + "\n" + "Apellido: " + this.apellido + "\n" + "Edad: " + this.edad;

        return  mensaje;
    }
}
