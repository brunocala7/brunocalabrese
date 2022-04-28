package com.company;

public class Visitante {
    private int id;
    private int numeroAsiento;

    public Visitante(int id, int numeroAsiento) {
        this.id = id;
        this.numeroAsiento = numeroAsiento;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroAsiento() {
        return numeroAsiento;
    }

    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
}
