package com.example;

public class TiendaCafe {
    public static void main(String[] args) {
        // Instanciar tres objetos de la clase Cafe con datos de diferentes regiones
        Cafe cafe1 = new Cafe("Café de Nariño", "Nariño", 45000.0, 25.5f);
        Cafe cafe2 = new Cafe("Café de Antioquia", "Antioquia", 42000.0, 30.0f);
        Cafe cafe3 = new Cafe("Café del Huila", "Huila", 48000.0, 18.75f);

        System.out.println("========== TIENDA DE CAFÉ COLOMBIANO ==========\n");

        // Mostrar la información de cada café
        System.out.println("--- Café 1 ---");
        cafe1.mostrarInformacion();
        System.out.println("Precio total: $" + String.format("%.2f", cafe1.calcularPrecioTotal()) + " COP\n");

        System.out.println("--- Café 2 ---");
        cafe2.mostrarInformacion();
        System.out.println("Precio total: $" + String.format("%.2f", cafe2.calcularPrecioTotal()) + " COP\n");

        System.out.println("--- Café 3 ---");
        cafe3.mostrarInformacion();
        System.out.println("Precio total: $" + String.format("%.2f", cafe3.calcularPrecioTotal()) + " COP\n");

        // Actualizar la cantidad de uno de los cafés
        System.out.println("=== ACTUALIZANDO CANTIDAD DEL CAFÉ 1 ===");
        cafe1.actualizarCantidad(35.0f);
        System.out.println("\n--- Información actualizada del Café 1 ---");
        cafe1.mostrarInformacion();
        System.out.println("Precio total actualizado: $" + String.format("%.2f", cafe1.calcularPrecioTotal()) + " COP\n");

        // Aplicar descuento a uno de los cafés
        System.out.println("=== APLICANDO DESCUENTO AL CAFÉ 2 ===");
        cafe2.aplicarDescuento(15.0);
        System.out.println("\n--- Información actualizada del Café 2 con descuento ---");
        cafe2.mostrarInformacion();
        System.out.println("Precio total con descuento: $" + String.format("%.2f", cafe2.calcularPrecioTotal()) + " COP");
    }
}

