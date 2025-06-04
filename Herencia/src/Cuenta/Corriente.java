package Cuenta;

public class Corriente extends Cuenta {
    private final double interes = 7.0;

    public Corriente(String titular, double saldo) {
        super(titular, saldo);
    }

    public void mostrar() {
        mostrarDatos("Cuenta Corriente", interes);
    }
}
