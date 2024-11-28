class FondosInsuficientesException extends Exception {
    public FondosInsuficientesException(String mensaje) {
        super(mensaje);
    }
}


class CuentaBancaria {
    private String titular;
    private double saldo;

   
    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

   
    public void retirar(double cantidad) throws FondosInsuficientesException {
        if (cantidad > saldo) {
          throw new FondosInsuficientesException("Fondos insuficientes para realizar la operación.");
        }
        saldo -= cantidad;  // Restar la cantidad retirada
        System.out.println("Retiro exitoso: $" + cantidad);
        System.out.println("Saldo restante: $" + saldo);
    }

   
    public double consultarSaldo() {
        return saldo;
    }

    
    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depósito exitoso: $" + cantidad);
        System.out.println("Nuevo saldo: $" + saldo);
    }
}

public class SimulacionBanco {
    public static void main(String[] args) {
       
        CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000);

        
        System.out.println("Saldo inicial: $" + cuenta.consultarSaldo());

        try {
           
            cuenta.retirar(1200);  
        } catch (FondosInsuficientesException e) {
           
            System.out.println("Error: " + e.getMessage());
        }

       
        try {
            cuenta.retirar(500);  
        } catch (FondosInsuficientesException e) {
            System.out.println("Error: " + e.getMessage());
        }

      
        System.out.println("Saldo final: $" + cuenta.consultarSaldo());
    }
}

