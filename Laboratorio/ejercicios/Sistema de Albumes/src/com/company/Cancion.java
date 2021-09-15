package com.company;

import java.util.HashSet;

public class Cancion {
    private String titulo;
    private HashSet<Artista> artistas;
    private HashSet<Autor> autores;

    public Cancion(String titulo, HashSet<Artista> artistas, HashSet<Autor> autores) {
        this.titulo = titulo;
        this.artistas = artistas;
        this.autores = autores;
    }

    public Boolean comprobarNacionalidad (String pais){
        Boolean b = false;

        for (Autor autor : this.getAutores()){
            if(autor.getNacionalidad() == pais){
                b = true;
            }
        }

        return b;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public HashSet<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(HashSet<Artista> artistas) {
        this.artistas = artistas;
    }

    public HashSet<Autor> getAutores() {
        return autores;
    }

    public void setAutores(HashSet<Autor> autores) {
        this.autores = autores;
    }
}
