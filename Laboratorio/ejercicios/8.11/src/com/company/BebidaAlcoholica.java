package com.company;

public class BebidaAlcoholica extends BebidaNeutra{
    private int cantidadAlcohol;

    public BebidaAlcoholica(String nombre, int cantidadAlcohol) {
        super(nombre, 0, cantidadAlcohol * 20);
        this.cantidadAlcohol = cantidadAlcohol;
    }

    public int getCantidadAlcohol() {
        return cantidadAlcohol;
    }

    public void setCantidadAlcohol(int cantidadAlcohol) {
        this.cantidadAlcohol = cantidadAlcohol;
    }
}
