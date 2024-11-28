public class MetodoDevuelveValor {

    public static void main(String[] args) {
       
        int x = 10;

        System.out.println("Antes de incrementar:");
        System.out.println("x = " + x);

        
        incrementar(x);

        System.out.println("Después de llamar a incrementar (sin asignar):");
        System.out.println("x = " + x);

   
        x = incrementar(x);

        System.out.println("Después de llamar a incrementar (asignando el valor):");
        System.out.println("x = " + x);
    }

   
    public static int incrementar(int x) {
        x = x + 1; 
        System.out.println("Dentro del método incrementar: x = " + x);
        return x; 
    }
}


