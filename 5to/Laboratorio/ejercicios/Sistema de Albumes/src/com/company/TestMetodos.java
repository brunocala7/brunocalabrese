package com.company;
import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.HashSet;
import org.junit.Test;

public class TestMetodos {
    @Test 
    public void casoArtistasQueParticiparon (){
        HashSet<Cancion> canciones = new HashSet<>();
        HashSet<Autor> autores = new HashSet<>();
        HashSet<Artista> artistas = new HashSet<>();
        Boolean participo = true;

        for(int i = 0;i < 3;i++){
            autores.add(new Autor("nombre", "apellido", "fechaNacimiento", "nacionalidad"));
        }

        for(int i = 0;i < 3;i++){
            artistas.add(new Autor("nombre", "apellido", "fechaNacimiento", "nacionalidad"));
        }
        
        for (int i = 0;i < 5;i++){
            canciones.add(new Cancion("Cancion",artistas,autores));
        }

        Album album = new Album("nombre", canciones);

        HashSet<Artista> resultado = album.artistasQueParticiparon();

        for(Artista artista : resultado){
            for (Cancion c : album.getCanciones()) {
                for(Artista artista2 : c.getArtistas()){
                    if(artista != artista2){
                        participo = false;
                    }
                }
            }
        }

        assertTrue(participo);
    }

    @Test 
    public void casoArtistaMasInfluyente (){
        HashSet<Cancion> canciones = new HashSet<>();
        HashSet<Autor> autores = new HashSet<>();
        HashSet<Artista> artistas = new HashSet<>();
        Boolean participo = true;

        for(int i = 0;i < 3;i++){
            autores.add(new Autor("nombre", "apellido", "fechaNacimiento", "nacionalidad"));
        }

        for(int i = 0;i < 3;i++){
            artistas.add(new Autor("nombre", "apellido", "fechaNacimiento", "nacionalidad"));
        }
        
        for (int i = 0;i < 5;i++){
            canciones.add(new Cancion("Cancion",artistas,autores));
        }

        Album album = new Album("nombre", canciones);
        Artista artista2 = new Artista("nombre", "apellido", "fechaNacimiento");
        int maxima_cantidad = 0;

        Artista resultado = album.artistaMasInfluyente();

        HashMap<Artista,Integer> lista = album.cancionesPorArtista();

        for (Artista artista : lista.keySet()) {
            if(lista.get(artista) > maxima_cantidad){
                artista2 = artista;
            }
        }

        assertEquals(artista2,resultado);
    }

    
}
