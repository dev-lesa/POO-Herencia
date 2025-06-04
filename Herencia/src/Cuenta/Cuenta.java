package Cuenta;

public class Cuenta {
    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void mostrarDatos(String tipoCuenta, double interes) {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: $" + saldo);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Interés: " + interes + "%");
        System.out.println("Interés generado: $" + calcularInteres(interes));
    }

    private double calcularInteres(double interes) {
        return saldo * interes / 100;
    }
}
