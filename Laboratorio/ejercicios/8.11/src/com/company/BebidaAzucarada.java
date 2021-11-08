package com.company;

public class BebidaAzucarada extends BebidaNeutra{
    private int cantidadAzucar;

    public BebidaAzucarada(String nombre, int cantidadAzucar) {
        super(nombre, 1, cantidadAzucar * 10);
        this.cantidadAzucar = cantidadAzucar;
    }

    public int getCantidadAzucar() {
        return cantidadAzucar;
    }

    public void setCantidadAzucar(int cantidadAzucar) {
        this.cantidadAzucar = cantidadAzucar;
    }
}
