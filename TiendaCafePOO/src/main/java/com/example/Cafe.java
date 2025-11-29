package com.example;

public class Cafe {
    // Atributos
    private String nombre;
    private String region;
    private double precioPorKilo;
    private float cantidadEnKilos;

    // Constructor
    public Cafe(String nombre, String region, double precioPorKilo, float cantidadEnKilos) {
        this.nombre = nombre;
        this.region = region;
        this.precioPorKilo = precioPorKilo;
        this.cantidadEnKilos = cantidadEnKilos;
    }

    // Método para mostrar información del café
    public void mostrarInformacion() {
        System.out.println("=== Información del Café ===");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Región: " + this.region);
        System.out.println("Precio por kilo: $" + String.format("%.2f", this.precioPorKilo) + " COP");
        System.out.println("Cantidad disponible: " + this.cantidadEnKilos + " kg");
        System.out.println("---------------------------");
    }

    // Método para calcular el precio total
    public double calcularPrecioTotal() {
        return this.precioPorKilo * this.cantidadEnKilos;
    }

    // Método para actualizar la cantidad disponible
    public void actualizarCantidad(float nuevaCantidad) {
        this.cantidadEnKilos = nuevaCantidad;
        System.out.println("Cantidad actualizada a: " + nuevaCantidad + " kg");
    }

    // Getters (opcionales, pero útiles)
    public String getNombre() {
        return nombre;
    }

    public String getRegion() {
        return region;
    }

    public double getPrecioPorKilo() {
        return precioPorKilo;
    }

    public float getCantidadEnKilos() {
        return cantidadEnKilos;
    }
}

