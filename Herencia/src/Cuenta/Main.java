package Cuenta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("ingrese el nombre del titular");
        String titular = entrada.nextLine();

        System.out.println("ingrese el saldo inicial");
        double saldo = entrada.nextDouble();

        System.out.println("tipo de cuenta \n1 - Ahorros \n2 - Corriente");
        int tipo = entrada.nextInt();

        if (tipo == 1) {
            Ahorros cuentaAhorros = new Ahorros(titular, saldo);
            cuentaAhorros.mostrar();
        } else if (tipo == 2) {
            Corriente cuentaCorriente = new Corriente(titular, saldo);
            cuentaCorriente.mostrar();
        } else {
            System.out.println("tipo de cuenta no valido");
        }
    }
}
