package com.company;

public class Persona {
    private String nombre;
    private int edad;
    private int dni;
    private int telefono;
    private String direccion;

    //CONSTRUCTORES

    public Persona(){
        nombre = "Raul Jimenez";
        edad = 43;
        dni = 45320321;
        telefono = 43219821;
        direccion = "Constituyentes 5491";
    }

    public Persona(String nuevo_nombre){
        nombre = nuevo_nombre;
        edad = 31;
        dni = 31829034;
        telefono = 48802131;
        direccion = "Pampa 8321";
    }

    public Persona(String nuevo_nombre,int edad_nueva,int dni_nuevo,int telefono_nuevo,String direccion_nueva){
        nombre = nuevo_nombre;
        edad = edad_nueva;
        dni = dni_nuevo;
        telefono = telefono_nuevo;
        direccion = direccion_nueva;
    }

    //GETTERS

    public String getNombre(){
        return nombre;
    }

    public int getEdad(){
        return edad;
    }

    public int getDni(){
        return dni;
    }

    public int getTelefono(){
        return telefono;
    }

    public String getDireccion(){
        return direccion;
    }
    
    //SETTERS

    public void setNombre(String nuevo_nombre) {
        nombre = nuevo_nombre;
    }

    public void setDireccion(String nueva_direccion) {
        direccion = nueva_direccion;
    }

    public void setDni(int nuevo_dni) {
        dni = nuevo_dni;
    }

    public void setEdad(int nueva_edad) {
        edad = nueva_edad;
    }

    public void setTelefono(int nuevo_telefono) {
        telefono = nuevo_telefono;
    }

    //METODOS

    boolean esMayorDeEdad(){
        boolean es_mayor = false;

        if(edad >= 18){
            es_mayor = true;
        }

        return es_mayor;
    }

    boolean sonLaMismaPersona(Persona p2){
        boolean son_iguales = false;

        if(nombre == p2.nombre && edad == p2.edad && dni == p2.dni && telefono == p2.telefono && direccion == p2.direccion){
            son_iguales = true;
        }

        return son_iguales;
    }

    


    boolean tienenLaMismaEdad(Persona p2){
        boolean misma_edad = false;

        if(edad == p2.edad){
            misma_edad = true;
        }

        return misma_edad;
    }

}
