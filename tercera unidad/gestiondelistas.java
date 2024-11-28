import java.util.ArrayList;
import java.util.Scanner;

public class GestionDeListas {

    public static void main(String[] args) {
       
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");
        lista.add("Elemento 4");

       
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Lista de elementos:");
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(i + ": " + lista.get(i));
        }

      
        System.out.print("\nIngresa el índice del elemento que deseas ver: ");
        int indice = scanner.nextInt();

        try {
         
            String elemento = lista.get(indice);
            System.out.println("Elemento en el índice " + indice + ": " + elemento);
        } catch (IndexOutOfBoundsException e) {
         
            System.out.println("Error: El índice " + indice + " está fuera de los límites de la lista.");
        } finally {
           
            scanner.close();
        }
    }
}
