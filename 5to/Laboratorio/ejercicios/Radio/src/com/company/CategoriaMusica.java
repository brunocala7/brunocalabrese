package com.company;

import java.util.HashSet;

public class CategoriaMusica extends Categoria{
    private Usuario musicalizador;
    private HashSet<String> estilos;

    public CategoriaMusica(){
        super();
        this.musicalizador = new Usuario("","",0,"");
        this.estilos = new HashSet<>();
    }

    public CategoriaMusica(String tipo, Usuario musicalizador) {
        super(tipo);
        this.musicalizador = musicalizador;
        this.estilos = new HashSet<>();
    }

    public Usuario getMusicalizador() {
        return musicalizador;
    }

    public void setMusicalizador(Usuario musicalizador) {
        this.musicalizador = musicalizador;
    }

    public HashSet<String> getEstilos() {
        return estilos;
    }

    public void setEstilos(HashSet<String> estilos) {
        this.estilos = estilos;
    }
}
