package com.company;
import java.util.HashSet;
import java.util.HashMap;

public class Artista extends Persona{
    private String nombreArtistico;
    private HashMap<String,HashSet<String>> albumes;

    public Artista(String nombre,String apellido,int edad,String nombreArtistico){
        super(nombre, apellido, edad);
        this.nombreArtistico = nombreArtistico;
        this.albumes = new HashMap<>();
    }

    public Artista(){
        super();
        this.nombreArtistico = "Da Vinci";
        this.albumes = new HashMap<>();
    }

    public static void imprimir(Artista artista){
        System.out.println(artista.toString());
    }

    public String devolverAlbum(HashSet<String> h){
        String album = new String();
        for (String cancion : h) {
            album = album + cancion + "\n";
        }
        return album;
    }

    public String getNombreArtistico() {
        return nombreArtistico;
    }

    public void setNombreArtistico(String nombreArtistico) {
        this.nombreArtistico = nombreArtistico;
    }

    public HashMap<String, HashSet<String>> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(HashMap<String, HashSet<String>> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString(){
        String mensaje = "Nombre: " + this.getNombre() + "\n" + "Apellido: " + this.getApellido() + "\n" + "Edad: " + this.getEdad() + "\n" + "Nombre Artistico: " + this.nombreArtistico + "\n";

        for (String nombre : this.albumes.keySet()) {
            mensaje = mensaje + "- Album " + nombre + "\n";
            mensaje += devolverAlbum(this.albumes.get(nombre));
        }

        return mensaje;
    }
}
