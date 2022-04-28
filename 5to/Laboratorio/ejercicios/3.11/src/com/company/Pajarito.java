package com.company;

public class Pajarito extends Mascota implements FuncionesAnimales{
    private int energia;

    public Pajarito(String nombre, String tipo, String nombreDueño) {
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
        System.out.println("pio");
    }

    @Override
    public void saludoExtraño() {
        
    }
}
