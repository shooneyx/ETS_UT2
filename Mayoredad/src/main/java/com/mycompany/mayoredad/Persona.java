package com.mycompany.mayoredad;

/*Realizamos en este archivo las operaciones de si es mayor edad que vemos en el video*/
public class Persona {
    /*definimos variables*/
    private int edad;
    
    /*hacemos operaciones con la variable edad, si es menor a 0 el valor, salta error */
    public Persona(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad no válida");
        }
        this.edad = edad;
    }

    /* Método para comprobar si es mayor edad */
    public boolean isMayorEdad() {
        return this.edad >= 18;
    }
}
