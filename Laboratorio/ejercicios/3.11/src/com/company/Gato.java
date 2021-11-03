package com.company;

public class Gato extends Mascota implements Alimentacion{
    private int energia;

    public Gato(String nombre, String tipo, String nombreDueño) {
        super(nombre, tipo, nombreDueño);
        this.energia = 0;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
}
