package com.testing.testcalculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraDividirPorCeroTest {

    private final Testcalculadora calculadora = new Testcalculadora();

    @Test
    public void testDividirPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(6, 0);
        });
        assertEquals("No se puede dividir entre cero.", exception.getMessage());
    }
}