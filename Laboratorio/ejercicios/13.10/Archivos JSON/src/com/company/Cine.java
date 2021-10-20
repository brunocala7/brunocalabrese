package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Cine {
    private String nombre;
    private String direccion;
    private HashSet<Sala> salas;

    public Cine(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.salas = new HashSet<>();
    }

    public HashSet<Visitante> visitantes(){
        HashSet<Visitante> listaVisitantes = new HashSet<>();

        for (Sala sala : this.salas){
            for(Visitante visitante : sala.getHistorialVisitantes()){
                listaVisitantes.add(visitante);
            }
        }

        return listaVisitantes;
    }

    public Integer cantidadTotalDeVisitantes(){
        int cantidadVisitantes = 0;

        for(Sala sala : this.salas){
            ArrayList<Visitante> historialVisitantes = sala.getHistorialVisitantes();
            cantidadVisitantes += historialVisitantes.size();
        }

        return cantidadVisitantes;
    }

    public HashMap<Integer,Integer> visitantesConCantidadDeVisitas (){
        HashMap<Integer,Integer> cantidadVisitasPorVisitante = new HashMap<>();

        for (Sala sala : this.salas){
            for (Visitante visitante : sala.getHistorialVisitantes()){
                int idVisitante = visitante.getId();
                if(cantidadVisitasPorVisitante.containsKey(idVisitante)){
                    int cantidad = cantidadVisitasPorVisitante.get(idVisitante) + 1;
                    cantidadVisitasPorVisitante.replace(idVisitante,cantidad);
                }
                else{
                    cantidadVisitasPorVisitante.put(idVisitante,1);
                }
            }
        }

        return cantidadVisitasPorVisitante;
    }

    public static void informeActual(Cine cine){
        for(Sala sala : cine.salas) {
            System.out.println("Nro: " + sala.getId());
            System.out.println("Cantidad de asientos: " + sala.getNumeroAsientos());
            System.out.println("Capacidad máxima permitida: " + Sala.getCapacidadMaxima());
            System.out.println("Cantidad de visitantes presentes: " + sala.cantidadDeVisitantesPresentes());
            System.out.println("Cantidad de asientos disponibles: " + sala.asientosDisponibles());
            System.out.println(" ");
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public HashSet<Sala> getSalas() {
        return salas;
    }

    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }
}
