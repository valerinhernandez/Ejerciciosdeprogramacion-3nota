import java.util.ArrayList;
import java.util.List;

public class MoverCeros {

    public static List<Object> moverCeros(List<Object> array) {
      
        List<Object> resultado = new ArrayList<>();

        
        for (Object elemento : array) {
            if (!(elemento instanceof Integer && (Integer) elemento == 0)) {
                resultado.add(elemento);
            }
        }

       
        for (Object elemento : array) {
            if (elemento instanceof Integer && (Integer) elemento == 0) {
                resultado.add(0);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
      
        List<Object> entrada = List.of(false, 1, 0, 1, 2, 0, 1, 3, "a");
        List<Object> resultado = moverCeros(entrada);
        System.out.println(resultado); 
    }
}

