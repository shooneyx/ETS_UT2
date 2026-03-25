package com.testing.testcalculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSumarTest {

    private final Testcalculadora calculadora = new Testcalculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3), "La suma de 2 y 3 debería ser 5.");
    }
}