public class StoreOufit {
    public static void main(String[] args) {
        // Precios originales
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        // Descuento del 15% para ambas prendas
        double descuento = 0.15;
        double precioCamisetaConDescuento = precioCamiseta * (1 - descuento);
        double precioPantalonConDescuento = precioPantalon * (1 - descuento);

        // Descuento adicional del 5% en la segunda camiseta
        double descuentoAdicional = 0.05;
        double precioSegundaCamiseta = precioCamisetaConDescuento * (1 - descuentoAdicional);

        // Precio total
        double total = precioCamisetaConDescuento + precioPantalonConDescuento + precioSegundaCamiseta;

        // Mostrar resultados
        System.out.println("Precio de la primera camiseta con descuento: $" + precioCamisetaConDescuento);
        System.out.println("Precio del pantalón con descuento: $" + precioPantalonConDescuento);
        System.out.println("Precio de la segunda camiseta con descuento adicional: $" + precioSegundaCamiseta);
        System.out.println("Precio total: $" + total);
    }
}
