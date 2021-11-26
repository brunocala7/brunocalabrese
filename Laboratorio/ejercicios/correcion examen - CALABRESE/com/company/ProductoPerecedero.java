package com.company;

public class ProductoPerecedero extends ProductoAlimenticio {
    private int temperaturaMinimaDeFrio;

    public ProductoPerecedero(String nombre, String origen, int codigo, int costo, int cantDiasParaVencerse, int temperaturaMinimaDeFrio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public int getTemperaturaMinimaDeFrio() {
        return temperaturaMinimaDeFrio;
    }

    public void setTemperaturaMinimaDeFrio(int temperaturaMinimaDeFrio) {
        this.temperaturaMinimaDeFrio = tempepackage com.company;

public class ProductoPerecedero extends ProductoAlimenticio {
    private int temperaturaMinimaDeFrio;

    public ProductoPerecedero(String nombre, String origen, int codigo, int costo, int cantDiasParaVencerse, int temperaturaMinimaDeFrio) {
        super(nombre, origen, codigo, costo, cantDiasParaVencerse);
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }

    public int getTemperaturaMinimaDeFrio() {
        return temperaturaMinimaDeFrio;
    }

    public void setTemperaturaMinimaDeFrio(int temperaturaMinimaDeFrio) {
        this.temperaturaMinimaDeFrio = temperaturaMinimaDeFrio;
    }
}
