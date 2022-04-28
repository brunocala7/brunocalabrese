package com.company;

public class Gato extends Mascota implements FuncionesAnimales{
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

    @Override
    public void alimentar() {
        this.energia++;
    }

    @Override
    public void saludoDueño() {
        System.out.println("miau");
    }

    @Override
    public void saludoExtraño() {
        System.out.println("MIAU!");
    }
}
