/* Programa para llevar inventario de productos
   Hecho por: Chrystian VIera 31.418.023
   Materia: Programación II UBA */

import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("CALCULADORA DE DESCUENTOS");
            System.out.println("=========================");
            
            // Crear un producto de ejemplo
            Producto producto = new Producto("Zapatos deportivos", 59.99);
            
            // Mostrar información inicial
            producto.mostrarInfo();
            
            // Pedir porcentaje de descuento
            System.out.print("\nIngrese el porcentaje de descuento (0-100): ");
            double descuento = scanner.nextDouble();
            
            // Calcular y mostrar precio con descuento
            double precioFinal = producto.calcularPrecioConDescuento(descuento);
            
            System.out.println("\n=== RESULTADO ===");
            System.out.println("Producto: " + producto.getNombre());
            System.out.println("Precio original: $" + producto.getPrecio());
            System.out.println("Descuento aplicado: " + descuento + "%");
            System.out.println("Precio con descuento: $" + precioFinal);
            System.out.println("=================");
        }
    }
}