package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Sala {
    public static int capacidadMaxima = 50;
    private int id;
    private int numeroAsientos;
    private ArrayList<Visitante> historialVisitantes;
    private HashSet<Visitante> visitantesPresentes;

    public Sala(int id, int numeroAsientos) {
        this.id = id;
        this.numeroAsientos = numeroAsientos;
        this.historialVisitantes = new ArrayList();
        this.visitantesPresentes = new HashSet<>();
    }

    public HashMap<Integer,Integer> nroDeAsientosConCantidadDePreferencias(){
        HashMap<Integer,Integer> asientoCantidad = new HashMap<>();

        for(Visitante visitante : this.historialVisitantes){
            int idAsiento = visitante.getNumeroAsiento();
            if(asientoCantidad.containsKey(idAsiento)){
                int cantidad = asientoCantidad.get(idAsiento) + 1;
                asientoCantidad.replace(idAsiento,cantidad);
            }
            else{
                asientoCantidad.put(idAsiento,1);
            }
        }

        return asientoCantidad;
    }

    public HashMap<Integer,Integer> visitantesConCantidadDeVisitas(){
        HashMap<Integer,Integer> cantidadDeVisitas = new HashMap<>();

        for(Visitante visitante : this.historialVisitantes){
            int idVisitante = visitante.getId();
            if(cantidadDeVisitas.containsKey(idVisitante)){
                int cantidad = cantidadDeVisitas.get(idVisitante) + 1;
                cantidadDeVisitas.replace(idVisitante,cantidad);
            }
            else{
                cantidadDeVisitas.put(idVisitante,1);
            }
        }

        return cantidadDeVisitas;
    }

    public Integer cantidadDeVisitantesPresentes(){
        return this.visitantesPresentes.size();
    }

    public Boolean estaLlena(){
        int cantidadVisitantes = this.cantidadDeVisitantesPresentes();
        return cantidadVisitantes == capacidadMaxima;
    }

    public Boolean hayInfiltrados(){
        int cantidadVisitantes = this.cantidadDeVisitantesPresentes();
        return cantidadVisitantes > capacidadMaxima;
    }

    public Integer asientosDisponibles(){
        int cantidadVisitantes = this.cantidadDeVisitantesPresentes();
        return capacidadMaxima - cantidadVisitantes;
    }





    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroAsientos() {
        return numeroAsientos;
    }

    public void setNumeroAsientos(int numeroAsientos) {
        this.numeroAsientos = numeroAsientos;
    }

    public ArrayList<Visitante> getHistorialVisitantes() {
        return historialVisitantes;
    }

    public void setHistorialVisitantes(ArrayList<Visitante> historialVisitantes) {
        this.historialVisitantes = historialVisitantes;
    }

    public HashSet<Visitante> getVisitantesPresentes() {
        return visitantesPresentes;
    }

    public void setVisitantesPresentes(HashSet<Visitante> visitantesPresentes) {
        this.visitantesPresentes = visitantesPresentes;
    }

    public static int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public static void setCapacidadMaxima(int capacidadMaxima) {
        Sala.capacidadMaxima = capacidadMaxima;
    }
}
