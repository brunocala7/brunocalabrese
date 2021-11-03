package com.company;

public class Pez extends Mascota{
    private int vidas;

    public Pez(String nombre, String tipo, String nombreDueño) {
        super(nombre, tipo, nombreDueño);
        this.vidas = 10;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }
}
