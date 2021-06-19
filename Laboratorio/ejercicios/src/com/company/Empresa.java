package com.company;

import java.util.HashMap;

public class Empresa extends Viviendas {
    private String razonSocial;

    public Empresa(String direccion,Duenio d1,String razonSocial){
        super(direccion,d1);
        this.razonSocial = razonSocial;
    }

    public float totalPagar(){
        float total = 0.f;
        HashMap<String,Float> aux = this.consumoPorMes;

        for (String mesActual : aux.keySet()) {
            total += aux.get(mesActual) * TARIFA_VIVIENDA;
        }

        return total;
    }

    public static float TARIFA_EMPRESA = 3.f;
}
