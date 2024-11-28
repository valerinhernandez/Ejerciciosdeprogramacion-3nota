public class ContadorDePares {
    public static void main(String[] args) {
        int contadorPares = 0;  // Variable para contar los números pares

        // Ciclo for para recorrer los números del 1 al 100
        for (int i = 1; i <= 100; i++) {
            // Verificar si el número es par
            if (i % 2 == 0) {
                contadorPares++;  // Si el número es par, incrementar el contador
            }
        }

        // Mostrar el resultado
        System.out.println("La cantidad de números pares entre 1 y 100 es: " + contadorPares);
    }
}
