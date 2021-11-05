package com.company;

public class Pez extends Mascota implements FuncionesAnimales{
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

    @Override
    public void alimentar() {
        vidas++;
    }

    @Override
    public void saludoDueño() {
        vidas--;
    }

    @Override
    public void saludoExtraño() {
        vidas = 0;
    }
}
