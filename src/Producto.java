public class Producto {
    
    // Atributos
    private final String nombre;
    private final double precio;
    
    // Constructor
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    // Getters
    public String getNombre() {
        return nombre;
    }
    
    public double getPrecio() {
        return precio;
    }
    
    // Método para calcular precio con descuento
    public double calcularPrecioConDescuento(double porcentajeDescuento) {
        // Verificamos que el descuento esté entre 0 y 100
        if(porcentajeDescuento >= 0 && porcentajeDescuento <= 100) {
            double descuento = precio * (porcentajeDescuento / 100);
            return precio - descuento;
        } else {
            System.out.println("Error: El descuento debe estar entre 0% y 100%");
            return precio; // Devuelve el precio sin descuento si hay error
        }
    }
    
    // Método para mostrar información del producto
    public void mostrarInfo() {
        System.out.println("\n--- INFORMACIÓN DEL PRODUCTO ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio original: $" + precio);
        System.out.println("-------------------------------");
    }
}
