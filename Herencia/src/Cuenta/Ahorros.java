package Cuenta;

public class Ahorros extends Cuenta {
    private final double interes = 5.0;

    public Ahorros(String titular, double saldo) {
        super(titular, saldo);
    }

    public void mostrar() {
        mostrarDatos("Cuenta de Ahorros", interes);
    }
}
