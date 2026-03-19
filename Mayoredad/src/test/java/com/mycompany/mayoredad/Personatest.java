package com.mycompany.mayoredad;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Personatest {

    /* Clase válida: menor de edad */
    @Test   /* test 1 */
    public void testEdadCero() {
        Persona p = new Persona(0);
        assertFalse(p.isMayorEdad());
    }

    @Test  /* test 2 */
    public void testEdadDiecisiete() {
        Persona p = new Persona(17);
        assertFalse(p.isMayorEdad());
    }

    /* Clase válida: mayor de edad */
    @Test  /* test 3 */
    public void testEdadDieciocho() {
        Persona p = new Persona(18);
        assertTrue(p.isMayorEdad());
    }

    @Test  /* test 4 */
    public void testEdadVeinticinco() {
        Persona p = new Persona(25);
        assertTrue(p.isMayorEdad());
    }

     /* Clase NO válida: edad negativa => DEBE SALTAR ERROR*/
    /* Con el código del video salia error porque era junit4 y no se usa en junit5 (el que estoy), se usa lo siguiente: */
    @Test /* test 5 */
    public void testEdadNegativaUno() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> 
            new Persona(-1)
        );
        assertEquals("Edad no válida", thrown.getMessage());
    }

    @Test /* test 6 */
    public void testEdadNegativaCien() {
        IllegalArgumentException thrown = assertThrows(IllegalArgumentException.class, () -> 
            new Persona(-100)
        );
        assertEquals("Edad no válida", thrown.getMessage());
    }
}
