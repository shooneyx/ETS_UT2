package com.testing.testcalculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDividirTest {

    private final Testcalculadora calculadora = new Testcalculadora();

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3), "La división de 6 entre 3 debería ser 2.");
    }
}