package com.company;

public class Hijo extends Persona {
    private String escuela;
    private String juegoFavorito;

    public Hijo (){
        super();
        this.escuela = "San Jose";
        this.juegoFavorito = "Minecraft";
    }

    public Hijo (String nombre, int edad, int dni, int tel, String dir, String escuela, String juegoFav) {
        super(nombre,edad,dni,tel,dir);
        this.escuela = escuela;
        this.juegoFavorito = juegoFav;
    }
}
