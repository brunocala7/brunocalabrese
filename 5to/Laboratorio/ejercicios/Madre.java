package com.company;
import java.util.HashSet;

public class Madre extends Persona {
    private String empresa;
    private HashSet <Hijo> conjuntoHijos;

    public Madre () {
        super();
        this.empresa = "";
        this.conjuntoHijos = new HashSet<>();
    }

    public Madre (String nombre, int edad, int dni, int tel, String dir,String empresa,HashSet<Hijo> hijos) {
        super(nombre,edad,dni,tel,dir);
        this.empresa = empresa;
        this.conjuntoHijos = hijos;
    }

    HashSet<Hijo> hijosMenores () {
        HashSet<Hijo> conjunto = new HashSet<>();

        for(Hijo h1 : this.conjuntoHijos){
            if(!h1.esMayorDeEdad()){
                conjunto.add(h1);
            }
        }

        return conjunto;
    }
}
