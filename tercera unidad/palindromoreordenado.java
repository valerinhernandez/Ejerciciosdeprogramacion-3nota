import java.util.HashMap;

public class PalindromoReordenado {

    public static boolean puedeFormarPalindromo(int numero) {
        // Convertir el número a un string para analizar sus dígitos
        String numeroStr = String.valueOf(numero);

        // Usar un HashMap para contar la frecuencia de cada dígito
        HashMap<Character, Integer> frecuencia = new HashMap<>();

        for (char digito : numeroStr.toCharArray()) {
            frecuencia.put(digito, frecuencia.getOrDefault(digito, 0) + 1);
        }

        // Contar cuántos dígitos tienen frecuencias impares
        int impares = 0;
        for (int cuenta : frecuencia.values()) {
            if (cuenta % 2 != 0) {
                impares++;
            }
            // Si hay más de un dígito con frecuencia impar, no se puede formar un palíndromo
            if (impares > 1) {
                return false;
            }
        }

        return true; // Se puede formar un palíndromo
    }

    public static void main(String[] args) {
        // Ejemplos de prueba
        System.out.println(puedeFormarPalindromo(5));        // true
        System.out.println(puedeFormarPalindromo(2121));     // true
        System.out.println(puedeFormarPalindromo(1331));     // true
        System.out.println(puedeFormarPalindromo(3357665));  // true
        System.out.println(puedeFormarPalindromo(1294));     // false
    }
}


