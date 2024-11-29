import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ElementosPares {

    public static List<Object> elementosPares(List<Object> lista) {
        
        HashMap<Object, Integer> conteo = new HashMap<>();

       
        for (Object elemento : lista) {
            conteo.put(elemento, conteo.getOrDefault(elemento, 0) + 1);
        }

       
        List<Object> resultado = new ArrayList<>();
        for (Object elemento : conteo.keySet()) {
            if (conteo.get(elemento) % 2 == 0) {
                resultado.add(elemento);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
       
        List<Object> lista1 = List.of("A", "B", "A", "C", "C", "C", "C");
        System.out.println(elementosPares(lista1)); // Output: [A, C]

       
        List<Object> lista2 = List.of(1, 2, 3, 1, 2);
        System.out.println(elementosPares(lista2)); 
    }
}

