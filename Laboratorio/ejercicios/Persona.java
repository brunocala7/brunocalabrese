package com.company;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    public Persona() {
        this.nombre = "Raul Jimenez";
        this.edad = 43;
        this.dni = 45320321;
        this.telefono = 43219821;
        this.direccion = "Constituyentes 5491";
    }

    public Persona(String nuevo_nombre) {
        this.nombre = nuevo_nombre;
        this.edad = 31;
        this.dni = 31829034;
        this.telefono = 48802131;
        this.direccion = "Pampa 8321";
    }

    public Persona(String nuevo_nombre, int edad_nueva, int dni_nuevo, int telefono_nuevo, String direccion_nueva) {
        this.nombre = nuevo_nombre;
        this.edad = edad_nueva;
        this.dni = dni_nuevo;
        this.telefono = telefono_nuevo;
        this.direccion = direccion_nueva;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getEdad() {
        return this.edad;
    }

    public int getDni() {
        return this.dni;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setNombre(String nuevo_nombre) {
        this.nombre = nuevo_nombre;
    }

    public void setDireccion(String nueva_direccion) {
        this.direccion = nueva_direccion;
    }

    public void setDni(int nuevo_dni) {
        this.dni = nuevo_dni;
    }

    public void setEdad(int nueva_edad) {
        this.edad = nueva_edad;
    }

    public void setTelefono(int nuevo_telefono) {
        this.telefono = nuevo_telefono;
    }

    boolean esMayorDeEdad() {
        boolean es_mayor = false;
        if (this.edad >= 18) {
            es_mayor = true;
        }

        return es_mayor;
    }

    boolean sonLaMismaPersona(Persona p2) {
        boolean son_iguales = false;
        if (this.nombre == p2.nombre && this.edad == p2.edad && this.dni == p2.dni && this.telefono == p2.telefono && this.direccion == p2.direccion) {
            son_iguales = true;
        }

        return son_iguales;
    }

    boolean tienenLaMismaEdad(Persona p2) {
        boolean misma_edad = false;
        if (this.edad == p2.edad) {
            misma_edad = true;
        }

        return misma_edad;
    }
}

