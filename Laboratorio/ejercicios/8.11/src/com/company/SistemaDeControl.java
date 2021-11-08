package com.company;

import java.util.HashSet;

public interface SistemaDeControl {
    public Consumidor personaConMejorCoeficienteDeHidratacion();
    public Consumidor personaConPeorCoeficienteDeHidratacion();
    public HashSet<String> nombresDeBebidasConsumidas();
    public String nombreDeBebidaMasConsumida();
}
