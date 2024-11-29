import java.text.Normalizer;
import java.util.HashSet;

public class Isograma {

    public static boolean esIsograma(String palabra) {
       
        if (palabra == null || palabra.isEmpty()) {
            return true; 
        }

       
        String limpio = palabra.trim().toLowerCase();

       
        limpio = Normalizer.normalize(limpio, Normalizer.Form.NFD);
        limpio = limpio.replaceAll("\\p{M}", ""); 

        
        if (limpio.contains(" ")) {
            return false; 
        }

       
        HashSet<Character> caracteres = new HashSet<>();

        for (char c : limpio.toCharArray()) {
            if (caracteres.contains(c)) {
                return false;
            }
            caracteres.add(c);
        }

        return true; 
    }

    public static void main(String[] args) {
        
        System.out.println(esIsograma("Murciélago")); 
        System.out.println(esIsograma("reto"));       
        System.out.println(esIsograma("Casa"));      
        System.out.println(esIsograma("PeRrO"));      
        System.out.println(esIsograma("GaTo"));       
    }
}
