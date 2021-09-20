package com.company;

import java.util.HashMap;

public class Horario {
    private HashMap<String,String> horarios;

    public Horario() {
        this.horarios = new HashMap<>();
    }

    public HashMap<String, String> getHorarios() {
        return horarios;
    }

    public void setHorarios(HashMap<String, String> horarios) {
        this.horarios = horarios;
    }

    public void agregarHorario(String dia,String horarios){
        this.horarios.put(dia,horarios);
    }
}
