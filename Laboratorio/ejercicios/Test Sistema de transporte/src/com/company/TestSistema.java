package com.company;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

import static org.junit.Assert.*;

public class TestSistema {

    @Test
    public void casoConPasajerosQueSeHanSubido(){
        Boolean valorCorrecto = false;

        Sistema s = new Sistema("Linea 110");

        ArrayList<Pasajero> lista = new ArrayList<>();
        lista.add(new Pasajero());
        lista.add(new Pasajero("Bruno","Calabrese",new TarjetaEquis(10f,20f,1f)));

        s.setHistorialPasajeros(lista);
        HashSet<Pasajero> pasajeros = s.pasajerosQueSeHanSubidoAlgunaVez();


    }


}
