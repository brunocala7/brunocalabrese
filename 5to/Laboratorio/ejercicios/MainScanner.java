package com.company;

import java.util.Scanner;

public class MainScanner {
    public MainScanner() {
    }

    public static void main(String[] args) {
        Scanner sc_int = new Scanner(System.in);
        Scanner sc_string = new Scanner(System.in);
        System.out.println("----Ingrese sus datos----");
        System.out.print("Nombre: ");
        String nombre = sc_string.nextLine();
        System.out.print("Edad: ");
        int edad = sc_int.nextInt();
        System.out.print("Dni: ");
        int dni = sc_int.nextInt();
        System.out.print("Telefono: ");
        int telefono = sc_int.nextInt();
        System.out.print("Direccion: ");
        String direccion = sc_string.nextLine();
        Persona p1 = new Persona(nombre, edad, dni, telefono, direccion);
        System.out.println("----MUESTRA DE DATOS----");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Dni: " + p1.getDni());
        System.out.println("Telefono: " + p1.getTelefono());
        System.out.println("Direccion: " + p1.getDireccion());
        System.out.println("----DESEA CAMBIAR ALGUN DATO----");
        System.out.println("1 -> Nombre");
        System.out.println("2 -> Edad");
        System.out.println("3 -> Dni");
        System.out.println("4 -> Telefono");
        System.out.println("5 -> Direccion");
        int opcion = sc_int.nextInt();
        switch(opcion) {
            case 1:
                p1.setNombre(sc_string.nextLine());
                break;
            case 2:
                p1.setEdad(sc_int.nextInt());
                break;
            case 3:
                p1.setDni(sc_int.nextInt());
                break;
            case 4:
                p1.setTelefono(sc_int.nextInt());
                break;
            case 5:
                p1.setDireccion(sc_string.nextLine());
        }

        System.out.println("----MUESTRA DE DATOS----");
        System.out.println("Nombre: " + p1.getNombre());
        System.out.println("Edad: " + p1.getEdad());
        System.out.println("Dni: " + p1.getDni());
        System.out.println("Telefono: " + p1.getTelefono());
        System.out.println("Direccion: " + p1.getDireccion());
    }
}
