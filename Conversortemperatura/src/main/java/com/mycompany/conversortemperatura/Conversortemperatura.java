package com.mycompany.conversortemperatura;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author josebonilla
 */
public class Conversortemperatura {

    // Convierte de Celsius a Fahrenheit
    public double celsiusAFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Convierte de Fahrenheit a Celsius
    public double fahrenheitACelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
}
