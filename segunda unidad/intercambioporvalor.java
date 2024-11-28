public class IntercambioPorValor {

    public static void main(String[] args) {
        int a = 5; // Valor inicial de a
        int b = 10; // Valor inicial de b

        System.out.println("Antes de intercambiar:");
        System.out.println("a = " + a + ", b = " + b);

        intercambiar(a, b); // Intento de intercambio

        System.out.println("Después de intentar intercambiar:");
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void intercambiar(int x, int y) {
        // Intercambia los valores de x e y (solo en el ámbito de este método)
        int temp = x;
        x = y;
        y = temp;

        System.out.println("Dentro del método intercambiar:");
        System.out.println("x = " + x + ", y = " + y);
    }
}
