package com.testing.testcalculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraMultiplicarTest {

    private final Testcalculadora calculadora = new Testcalculadora();

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3), "La multiplicación de 2 y 3 debería ser 6.");
    }
}