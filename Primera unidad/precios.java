public class Precios {
    public static void main(String[] args) {
        double precioCamiseta = 25;
        double precioPantalon = 30;

        double descuento = 0.15; // 15% de descuento
        double descuentoAdicional = 0.05; // 5% de descuento adicional

        double precioCamisetaDescuento = precioCamiseta * (1 - descuento);
        double precioPantalonDescuento = precioPantalon * (1 - descuento);

        double precioTotal = precioCamisetaDescuento + precioPantalonDescuento;

        System.out.println("Precio total con descuento: $" + precioTotal);

        // Si se compra una segunda camiseta, se aplica un descuento adicional
        double precioCamisetaDescuentoAdicional = precioCamisetaDescuento ;
        double precioTotalConSegundaCamiseta = precioTotal + precioCamisetaDescuentoAdicional;

        System.out.println("Precio total con segunda camiseta y descuento adicional: $" + precioTotalConSegundaCamiseta);
    }
}
