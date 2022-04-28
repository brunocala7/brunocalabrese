package com.company;
import org.junit.Test;

import jdk.internal.jshell.tool.resources.version;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import static org.junit.Assert.*;

public class TestSistema {

    @Test
    public void casoConPasajerosQueSeHanSubido(){
        Boolean valorCorrecto = true;

        Sistema s = new Sistema("Linea 110");

        ArrayList<Pasajero> lista = new ArrayList<>();
        lista.add(new Pasajero());
        lista.add(new Pasajero("Bruno","Calabrese",new TarjetaEquis(10f,20f,1f)));

        s.setHistorialPasajeros(lista);

        for(Pasajero pasajero : s.pasajerosQueSeHanSubidoAlgunaVez()){
            if(!(s.getHistorialPasajeros().contains(pasajero))){
                valorCorrecto = false;
            }
        }

        assertTrue(valorCorrecto);
    }

    @Test 
    public void casoConPasajerosUltimoMonto() {
        /*
        devuelve el ultimo monto de cada pasajero
        */
        Boolean b = true;
        ArrayList<Pasajero> a = new ArrayList<>();

        a.add(new Pasajero());
        a.add(new Pasajero("Hector","Quiroga",new TarjetaEquis(10f, 20f, 1f)));

        Sistema s = new Sistema("Linea 110");
        s.setHistorialPasajeros(a);

        HashMap<Pasajero,Float> lista = s.pasajerosConUltimoMontoAbonado();

        for (Pasajero p : lista.keySet()){
            Float monto = lista.get(p);
            if(!(monto == p.getTarjeta().ultimoMontoAbonado())){
                b = false; 
            }
        }

        assertTrue(b);
    }

    @Test 
    public void casoSuperaElSaldoNegativo() {
        Sistema s = new Sistema("Linea 110");
        Pasajero p1 = new Pasajero();

        assertFalse(s.seSuperaElSaldoNegativo(p1));
    }


}
