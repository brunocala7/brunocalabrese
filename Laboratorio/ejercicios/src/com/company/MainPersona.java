package com.company;

public class MainPersona {

    public static void main(String[] args) {
        Persona p1 = new Persona();
        Persona p2 = new Persona("Manolo Lamas");
        Persona p3 = new Persona("Gonzalo Higuain",32,31902647,21349234,"Lavallen 9321");
        Persona p4 = new Persona("Gonzalo Higuain",32,31902647,21349234,"Lavallen 9321");


        int edad_nueva;

        edad_nueva = p1.getEdad();

        //Primer persona
        p1.setEdad(edad_nueva * 2);

        //Segunda persona
        p2.setTelefono(74920129);

        //Tercera persona
        System.out.println("Nombre: " + p3.getNombre());
        System.out.println("Edad: " + p3.getEdad());
        System.out.println("DNI: " + p3.getDni());
        System.out.println("Telefono: " + p3.getTelefono());
        System.out.println("Direccion: " + p3.getDireccion());
    }
}
