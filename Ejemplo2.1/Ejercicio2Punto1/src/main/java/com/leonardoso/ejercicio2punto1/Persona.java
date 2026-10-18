package com.leonardoso.ejercicio2punto1;

public class Persona {
    protected String nombre;
    protected int edad;

    // Constructor vacío por defecto
    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    // Constructor con parámetros
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}