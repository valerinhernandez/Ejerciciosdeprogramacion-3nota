public class PasarCadenaPorValor {

    public static void main(String[] args) {
      
        String texto = "Hola";

        System.out.println("Antes de modificar:");
        System.out.println("texto = " + texto);

       
        modificarCadena(texto);

        System.out.println("Después de llamar a modificarCadena:");
        System.out.println("texto = " + texto);
    }

    
    public static void modificarCadena(String texto) {
        
        texto = texto + " mundo"; 
        System.out.println("Dentro del método modificarCadena:");
        System.out.println("texto = " + texto);
    }
}



