package com.testing.testcalculadora;

/* Solo le hemos metido los paquetes de JUnit
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Calculadoratestpruebas {
    
    private final Testcalculadora calculadora = new Testcalculadora();

    @Test
    public void testSumar() {
        assertEquals(5, calculadora.sumar(2, 3), "La suma de 2 y 3 debería ser 5.");
    }

    @Test
    public void testRestar() {
        assertEquals(1, calculadora.restar(3, 2), "La resta de 3 y 2 debería ser 1.");
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calculadora.multiplicar(2, 3), "La multiplicación de 2 y 3 debería ser 6.");
    }

    @Test
    public void testDividir() {
        assertEquals(2, calculadora.dividir(6, 3), "La división de 6 entre 3 debería ser 2.");
    }

    @Test
    public void testDividirPorCero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculadora.dividir(6, 0);
        });
        assertEquals("No se puede dividir entre cero.", exception.getMessage());
    }
    
}
