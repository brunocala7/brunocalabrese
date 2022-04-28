package com.company;

import java.util.HashMap;
import java.util.HashSet;

public class Album {
    private String nombre;
    private HashSet<Cancion> canciones;

    public Album(String nombre, HashSet<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = canciones;
    }

    public HashSet<Artista> artistasQueParticiparon() {
        HashSet<Artista> artistas = new HashSet<>();
        for (Cancion cancion : canciones) {
            HashSet<Artista> artista = cancion.getArtistas();
            for (Artista a : artista) {
                artistas.add(a);
            }
        }
        return artistas;
    }

    public HashMap<Artista,Integer> cancionesPorArtista(){
        HashMap<Artista,Integer> lista = new HashMap<>();

        for (Cancion cancion: canciones) {
            for (Artista a1 : cancion.getArtistas()) {
                if(lista.containsKey(a1)){
                    int valor = lista.get(a1);
                    lista.replace(a1,valor + 1);
                }
                else{
                    lista.put(a1,1);
                }
            }
        }

        return lista;
    }

    public Artista artistaMasInfluyente(){
        Artista artista = new Artista("horacio","larreta","2312");
        int valor_maximo = 0;

        HashMap<Artista,Integer> canciones = this.cancionesPorArtista();

        for (Artista a1 : canciones.keySet()) {
            if(canciones.get(a1) > valor_maximo){
                artista = a1;
            }
        }

        return artista;
    }

    public HashSet<Cancion> cancionesDeUnaNacionalidad(String nacionalidad){
        HashSet<Cancion> lista = new HashSet<>();

        for (Cancion cancion: canciones){
            if(cancion.comprobarNacionalidad(nacionalidad)){
                lista.add(cancion);
            }
        }

        return lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public HashSet<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(HashSet<Cancion> canciones) {
        this.canciones = canciones;
    }
}
