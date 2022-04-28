package com.company;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class TestTarjetaEquis {
    @Test
    public void casoConCargarSube(){
        TarjetaEquis t = new TarjetaEquis(10.f,-50.f,1.f);

        float monto = 50;
        float valorEsperado = t.getSaldo() + monto;

        t.cargarSube(monto);

        assertEquals(valorEsperado,t.getSaldo(),0);
    }

    @Test
    public void casoConUltimoMontoAbonado(){
        TarjetaEquis t = new TarjetaEquis(10.f,-50.f,1.f);

        float precioViaje = 5.50f;
        Viaje v = new Viaje(precioViaje,"ofensf","21:03");

        t.getListaViajes().add(v);

        assertEquals(precioViaje,t.getListaViajes().get(t.listaViajes.size()-1));
    }
}
