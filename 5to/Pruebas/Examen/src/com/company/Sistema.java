package com.company;
import java.util.HashSet;

public class Sistema {
    public static int precioMinimo = 500;
    private HashSet<Artista> listaArtistas;

    public Sistema(){
        this.listaArtistas = new HashSet<>();
    }

    public void mostrarCantantesPrecios(){
        for(Artista a : listaArtistas){
            System.out.println(a.getNombreArtistico() + " - " + (precioMinimo + a.getAlbumes().size()) + "$");
        }
    }

    public void masDeTresAlbumes(){
        for(Artista a : listaArtistas){
            if(a.getAlbumes().size() >= 3){
                System.out.println(a.getNombreArtistico() + "\n");
            }
        }
    }

    public HashSet<Artista> getListaArtistas() {
        return listaArtistas;
    }

    public void setListaArtistas(HashSet<Artista> listaArtistas) {
        this.listaArtistas = listaArtistas;
    }
}
