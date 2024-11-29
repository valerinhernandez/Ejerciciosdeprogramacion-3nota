import java.util.Scanner;

class Personaje {
    String nombre;
    int fuerza;
    int velocidad;
    int vida_hp;

    public Personaje(String nombre, int fuerza, int velocidad, int vida_hp) {
        this.nombre = nombre;
        this.fuerza = fuerza;
        this.velocidad = velocidad;
        this.vida_hp = vida_hp;
    }

    public void atacar(Personaje oponente) {
        int daño = this.fuerza;
        oponente.recibirAtaque(daño);
        System.out.println(this.nombre + " atacó a " + oponente.nombre + " causando " + daño + " puntos de daño.");
    }

    public void defender(int daño) {
        int reducido = daño / 2;
        this.vida_hp -= reducido;
        System.out.println(this.nombre + " se defendió, recibiendo solo " + reducido + " puntos de daño.");
    }

    public void recibirAtaque(int daño) {
        this.vida_hp -= daño;
        System.out.println(this.nombre + " recibió " + daño + " puntos de daño. Vida restante: " + this.vida_hp);
    }

    public void recuperarse() {
        this.vida_hp += 20;
        System.out.println(this.nombre + " se recuperó. Vida ahora: " + this.vida_hp);
    }

    // Método para mostrar estadísticas
    public void mostrarEstadisticas() {
        System.out.println("\n--- Estadísticas de " + this.nombre + " ---");
        System.out.printf("Fuerza: %d\n", this.fuerza);
        System.out.printf("Velocidad: %d\n", this.velocidad);
        System.out.printf("Vida: %d\n", this.vida_hp);
    }

    public void mostrarHabilidades() {
        System.out.println("Habilidades no especificadas para este personaje.");
    }

    public void ataqueEspecial(Personaje oponente) {
    }
}

class SuperHero extends Personaje {
    public SuperHero(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    @Override
    public void ataqueEspecial(Personaje oponente) {
        int daño = this.fuerza * 2;
        oponente.recibirAtaque(daño);
        System.out.println(this.nombre + " utilizó su ataque especial contra " + oponente.nombre + " causando " + daño + " puntos de daño.");
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("\n--- Habilidades de " + this.nombre + " ---");
        System.out.println("1. Ataque normal: causa daño basado en la fuerza.");
        System.out.println("2. Defensa: reduce el daño recibido a la mitad.");
        System.out.println("3. Ataque especial: duplica el daño de su ataque normal.");
        System.out.println("4. Recuperación: recupera 20 puntos de vida.");
    }
}

class Villano extends Personaje {
    public Villano(String nombre, int fuerza, int velocidad, int vida_hp) {
        super(nombre, fuerza, velocidad, vida_hp);
    }

    @Override
    public void ataqueEspecial(Personaje oponente) {
        int daño = this.fuerza * 2;
        oponente.recibirAtaque(daño);
        System.out.println(this.nombre + " hizo trampa y duplicó su ataque contra " + oponente.nombre + ", causando " + daño + " puntos de daño.");
    }

    @Override
    public void mostrarHabilidades() {
        System.out.println("\n--- Habilidades de " + this.nombre + " ---");
        System.out.println("1. Ataque normal: causa daño basado en la fuerza.");
        System.out.println("2. Defensa: reduce el daño recibido a la mitad.");
        System.out.println("3. Ataque especial: duplica el daño de su ataque normal.");
        System.out.println("4. Recuperación: recupera 20 puntos de vida.");
    }
}

public class Heroes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SuperHero batman = new SuperHero("Batman", 80, 85, 210);
        SuperHero superman = new SuperHero("Superman", 100, 95, 300);
        SuperHero ironman = new SuperHero("Iron-Man", 85, 75, 250);
        SuperHero spiderman = new SuperHero("Spider-Man", 70, 90, 200);

        Villano joker = new Villano("Joker", 65, 80, 180);
        Villano lexLuthor = new Villano("Lex Luthor", 75, 70, 220);
        Villano duendeVerde = new Villano("Duende Verde", 70, 85, 190);
        Villano whiplash = new Villano("Whiplash", 80, 60, 230);

        Personaje personajeElegido = null;
        Personaje oponenteElegido = null;

        System.out.println("¿Quieres ser un héroe o un villano?");
        System.out.println("1. Héroe");
        System.out.println("2. Villano");
        int tipoPersonaje = scanner.nextInt();

        if (tipoPersonaje == 1) {
            System.out.println("Selecciona a tu héroe:");
            SuperHero[] heroes = {batman, superman, ironman, spiderman};
            for (int i = 0; i < heroes.length; i++) {
                System.out.println((i + 1) + ". " + heroes[i].nombre);
                heroes[i].mostrarEstadisticas();
                heroes[i].mostrarHabilidades();
                System.out.println("-------------------------");
            }
            int seleccionHeroe = scanner.nextInt();
            personajeElegido = heroes[seleccionHeroe - 1];

            System.out.println("Selecciona al villano con el que quieres luchar:");
            Villano[] villanos = {joker, lexLuthor, duendeVerde, whiplash};
            for (int i = 0; i < villanos.length; i++) {
                System.out.println((i + 1) + ". " + villanos[i].nombre);
                villanos[i].mostrarEstadisticas();
                villanos[i].mostrarHabilidades();
                System.out.println("-------------------------");
            }
            int seleccionVillano = scanner.nextInt();
            oponenteElegido = villanos[seleccionVillano - 1];
        } else if (tipoPersonaje == 2) {
            System.out.println("Selecciona a tu villano:");
            Villano[] villanos = {joker, lexLuthor, duendeVerde, whiplash};
            for (int i = 0; i < villanos.length; i++) {
                System.out.println((i + 1) + ". " + villanos[i].nombre);
                villanos[i].mostrarEstadisticas();
                villanos[i].mostrarHabilidades();
                System.out.println("-------------------------");
            }
            int seleccionVillano = scanner.nextInt();
            personajeElegido = villanos[seleccionVillano - 1];

            System.out.println("Selecciona al héroe con el que quieres luchar:");
            SuperHero[] heroes = {batman, superman, ironman, spiderman};
            for (int i = 0; i < heroes.length; i++) {
                System.out.println((i + 1) + ". " + heroes[i].nombre);
                heroes[i].mostrarEstadisticas();
                heroes[i].mostrarHabilidades();
                System.out.println("-------------------------");
            }
            int seleccionHeroe = scanner.nextInt();
            oponenteElegido = heroes[seleccionHeroe - 1];
        }

        while (personajeElegido.vida_hp > 0 && oponenteElegido.vida_hp > 0) {
            System.out.println("\nTurno de " + personajeElegido.nombre);
            System.out.println("1. Atacar");
            System.out.println("2. Defenderse");
            System.out.println("3. Usar ataque especial");
            System.out.println("4. Recuperarse");
            int accion = scanner.nextInt();

            switch (accion) {
                case 1: 
                    personajeElegido.atacar(oponenteElegido);
                    break;
                case 2: 
                    personajeElegido.defender(oponenteElegido.fuerza);
                    break;
                case 3: 
                    personajeElegido.ataqueEspecial(oponenteElegido);
                    break;
                case 4: 
                    personajeElegido.recuperarse();
                    break;
                default: 
                    System.out.println("Opción no válida.");
                    break;
            }

            if (oponenteElegido.vida_hp <= 0) {
                System.out.println(oponenteElegido.nombre + " ha sido derrotado.");
                break;
            }

            System.out.println("\nTurno de " + oponenteElegido.nombre);
            if (Math.random() > 0.5) {
                oponenteElegido.ataqueEspecial(personajeElegido);
            } else {
                oponenteElegido.atacar(personajeElegido);
            }

            if (personajeElegido.vida_hp <= 0) {
                System.out.println(personajeElegido.nombre + " ha sido derrotado.");
                break;
            }

            personajeElegido.mostrarEstadisticas();
            oponenteElegido.mostrarEstadisticas();
        }

        scanner.close();
    }
}