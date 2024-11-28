public class CuentaBancaria {
    public static void main(String[] args) {
        double cantidadInicial = 1000; // Cantidad inicial en la cuenta
        double retiroSemanal = 200; // Retiro semanal
        int semanas = 4; // Número de semanas en un mes

        double cantidadFinal = cantidadInicial - (retiroSemanal * semanas);

        System.out.println("Cantidad final en la cuenta: $" + cantidadFinal);
    }
}