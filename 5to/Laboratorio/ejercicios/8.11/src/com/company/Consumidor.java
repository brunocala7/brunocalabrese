package com.company;

import java.util.HashMap;

public class Consumidor {
    private String nombre;
    private String apellido;
    private int dni;
    private HashMap<BebidaAlcoholica,Integer> alcoholicasConsumidas;
    private HashMap<BebidaAzucarada,Integer> azucaradasConsumidas;
    private HashMap<BebidaNeutra,Integer> neutrasConsumidas;

    public Consumidor(String nombre, String apellido, int dni) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.alcoholicasConsumidas = new HashMap<>();
        this.azucaradasConsumidas = new HashMap<>();
        this.neutrasConsumidas = new HashMap<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int coeficienteHidratacionTotal(){
        int coeficienteHidratacion = 0;

        for (BebidaNeutra bebidaNeutra : this.neutrasConsumidas.keySet()){
            coeficienteHidratacion += this.neutrasConsumidas.get(bebidaNeutra) * (bebidaNeutra.getCoeficientePositividad() - bebidaNeutra.getCoeficienteNegatividad());
        }
        for (BebidaAlcoholica bebidaAlcoholica : this.alcoholicasConsumidas.keySet()){
            coeficienteHidratacion += this.alcoholicasConsumidas.get(bebidaAlcoholica) * (bebidaAlcoholica.getCoeficientePositividad() - bebidaAlcoholica.getCoeficienteNegatividad());
        }
        for (BebidaAzucarada bebidaAzucarada : this.azucaradasConsumidas.keySet()){
            coeficienteHidratacion += this.azucaradasConsumidas.get(bebidaAzucarada) * (bebidaAzucarada.getCoeficientePositividad() - bebidaAzucarada.getCoeficienteNegatividad());
        }

        return coeficienteHidratacion;
    }
}
