package com.company;

public class MainElectricidad {
    public static void main(String[] args) {
        Duenio d1 = new Duenio("Jose", "Hernandez", 23094832);
        Viviendas v1 = new Viviendas("Congreso 3829", d1);

        v1.insertarConsumo("Enero", 40f);
        v1.insertarConsumo("Marzo", 32.4f);

        System.out.println("El total a pagar es: " + v1.totalPagar());

    }
}
