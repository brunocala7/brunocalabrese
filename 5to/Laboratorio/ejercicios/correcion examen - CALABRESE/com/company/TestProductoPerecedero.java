package com.company;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestProductoPerecedero {
    @Test
    public void casoConMenosDe90Dias() {

        ProductoPerecedero productoPerecedero = new ProductoPerecedero("fideos", "italiano", 2, 405, 31, -5);

        float precioEsperado = 440.5f;

        float precioObtenido = productoPerecedero.calcularPrecioFinal();

        assertEquals(precioObtenido, precioEsperado);

    }

    @Test
    public void casoConMenosDe90Dias() {

        ProductoPerecedero productoPerecedero = new ProductoPerecedero("fideos", "italiano", 2, 405, 31, -5);

        float precioEsperado = 505.25f;

        float precioObtenido = productoPerecedero.calcularPrecioFinal();

        assertEquals(precioObtenido, precioEsperado);

    }
}

