
class Rectangulo {
    int ancho;
    int alto;

    Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
}

public class ModificarObjeto {

    public static void main(String[] args) {
       
        Rectangulo rectangulo = new Rectangulo(5, 10);

        System.out.println("Antes de modificar:");
        System.out.println("Ancho = " + rectangulo.ancho + ", Alto = " + rectangulo.alto);

        
        modificarRectangulo(rectangulo);

        System.out.println("Después de modificar:");
        System.out.println("Ancho = " + rectangulo.ancho + ", Alto = " + rectangulo.alto);
    }

  
    public static void modificarRectangulo(Rectangulo r) {
        r.ancho = 20;
        r.alto = 30;  
        System.out.println("Dentro del método modificarRectangulo:");
        System.out.println("Ancho = " + r.ancho + ", Alto = " + r.alto);
    }
}
