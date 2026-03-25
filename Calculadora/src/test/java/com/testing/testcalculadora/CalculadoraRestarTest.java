package com.testing.testcalculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraRestarTest {

    private final Testcalculadora calculadora = new Testcalculadora();

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2), "La resta de 3 y 2 debería ser 1.");
    }
}