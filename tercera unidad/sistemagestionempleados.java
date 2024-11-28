// Clase base Empleado
abstract class Empleado {
    // Atributos comunes para todos los empleados
    private String nombre;
    private int edad;
    private double salarioBase;

    // Constructor
    public Empleado(String nombre, int edad, double salarioBase) {
        this.nombre = nombre;
        this.edad = edad;
        this.salarioBase = salarioBase;
    }

    // Métodos getter y setter (encapsulación)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // Método abstracto para calcular el salario (polimorfismo)
    public abstract double calcularSalario();

    // Método abstracto para calcular las bonificaciones (polimorfismo)
    public abstract double calcularBonificacion();
}

// Subclase Gerente que hereda de Empleado
class Gerente extends Empleado {
    private double bonus;

    // Constructor
    public Gerente(String nombre, int edad, double salarioBase, double bonus) {
        super(nombre, edad, salarioBase);
        this.bonus = bonus;
    }

    // Redefinición del método calcularSalario (polimorfismo)
    @Override
    public double calcularSalario() {
        return getSalarioBase() + bonus;
    }

    // Redefinición del método calcularBonificacion (polimorfismo)
    @Override
    public double calcularBonificacion() {
        return bonus * 0.1; // Bonificación del 10% del bonus
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}

// Subclase Desarrollador que hereda de Empleado
class Desarrollador extends Empleado {
    private int proyectos;

    // Constructor
    public Desarrollador(String nombre, int edad, double salarioBase, int proyectos) {
        super(nombre, edad, salarioBase);
        this.proyectos = proyectos;
    }

    // Redefinición del método calcularSalario (polimorfismo)
    @Override
    public double calcularSalario() {
        return getSalarioBase() + (proyectos * 200); // $200 por proyecto adicional
    }

    // Redefinición del método calcularBonificacion (polimorfismo)
    @Override
    public double calcularBonificacion() {
        return proyectos * 50; // Bonificación de $50 por proyecto
    }

    public int getProyectos() {
        return proyectos;
    }

    public void setProyectos(int proyectos) {
        this.proyectos = proyectos;
    }
}

// Clase principal para probar el sistema
public class SistemaGestionEmpleados {
    public static void main(String[] args) {
        // Crear empleados
        Empleado gerente = new Gerente("Carlos", 45, 5000, 1000);
        Empleado desarrollador = new Desarrollador("Ana", 30, 3000, 5);

        // Mostrar salarios y bonificaciones
        System.out.println("Salario Gerente: " + gerente.calcularSalario());
        System.out.println("Bonificación Gerente: " + gerente.calcularBonificacion());

        System.out.println("Salario Desarrollador: " + desarrollador.calcularSalario());
        System.out.println("Bonificación Desarrollador: " + desarrollador.calcularBonificacion());
    }
}

