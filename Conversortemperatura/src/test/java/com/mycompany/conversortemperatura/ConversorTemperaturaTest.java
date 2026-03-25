
package com.mycompany.conversortemperatura;

/* Simplemente he tenido que quitar el import del paquete porque no hacia falta y llamar a este paquete
    como al de source packages para que coincidan y funcione el test
 */


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class ConversorTemperaturaTest {

    private final Conversortemperatura conversor = new Conversortemperatura();

    @Test
    public void testCelsiusAFahrenheit() {
        assertEquals(32.0, conversor.celsiusAFahrenheit(0), 0.001, "0°C debería ser 32°F");
        assertEquals(212.0, conversor.celsiusAFahrenheit(100), 0.001, "100°C debería ser 212°F");
    }

    @Test
    public void testFahrenheitACelsius() {
        assertEquals(0.0, conversor.fahrenheitACelsius(32), 0.001, "32°F debería ser 0°C");
        assertEquals(100.0, conversor.fahrenheitACelsius(212), 0.001, "212°F debería ser 100°C");
    }
}

