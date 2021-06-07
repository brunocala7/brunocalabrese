package com.company;

import java.util.HashMap;
import java.util.ArrayList;

public class Alumno extends Persona{
    private String curso;
    private HashMap<String,ArrayList<Float>> notasPorMateria;

    public Alumno (String curso,HashMap<String,ArrayList<Float>> notasPorMateria){
        super();
        this.curso = curso;
        this.notasPorMateria = notasPorMateria;
    }

    public String getCurso (){
        return this.curso;
    }

    public HashMap<String,ArrayList<Float>> getNotasPorMateria (){
        return this.notasPorMateria;
    }

    public void setCurso (String entrada){
        this.curso = entrada;
    }

    public void agregarNota (String materia,Float nota){
        this.notasPorMateria.get(materia).add(nota);
    }

    public Float menorNota (String materia){
        Float notaMenor = 0.f;

        for (Float a : this.notasPorMateria.get(materia)) {
            if(a <= notaMenor){
                notaMenor = a;
            }
        }

        return notaMenor;
    }

    public Float mayorNota (String materia){
        Float notaMayor = 0.f;

        for (Float a : this.notasPorMateria.get(materia)) {
            if(a >= notaMayor){
                notaMayor = a;
            }
        }

        return notaMayor;
    }

    public Float promedio (String materia){
        Float promedio = 0.f;
        Float sumaNotas = 0.f;

        for (Float aux : this.notasPorMateria.get(materia)) {
            sumaNotas += aux;
        }

        promedio = sumaNotas / this.notasPorMateria.size();

        return promedio;
    }

    public void agregarMateria(String nombreDeMateria){
        ArrayList<Float> new_arrray = new ArrayList<>();

        this.notasPorMateria.put(nombreDeMateria,new_arrray);
    }
}