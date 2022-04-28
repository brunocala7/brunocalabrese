package com.company;

import java.util.HashMap;

public class Viviendas {
    private String direccion;
    private Duenio encargado ;
    protected HashMap<String,Float> consumoPorMes;

    public Viviendas (String dir,Duenio d1){
        this.direccion = dir;
        this.encargado = d1;
        this.consumoPorMes = new HashMap<>();
    }

    public void insertarConsumo (String mes,float consumo){
        boolean mesCargado = false;

        for (String mesActual : consumoPorMes.keySet()) {
            if(mesActual == mes){
                mesCargado = true;
                break;
            }            
        }

        if(!mesCargado){
            this.consumoPorMes.put(mes, consumo);
        }
    }

    public float totalPagar(){
        float total = 0.f;
        HashMap<String,Float> aux = this.consumoPorMes;

        for (String mesActual : aux.keySet()) {
            total += aux.get(mesActual) * TARIFA_VIVIENDA;
        }

        return total;
    }

    public static float TARIFA_VIVIENDA = 2.f;
}
