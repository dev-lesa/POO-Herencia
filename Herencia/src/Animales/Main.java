package Animales;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el tipo");
        String tipo = entrada.nextLine();
        System.out.println("Ingrese la raza");
        String raza = entrada.nextLine();
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();
        entrada.nextLine();
        Perro p = new Perro (tipo, raza, edad);
        p.describir();
        p.ladrar();
        p.mostrarEdadVacunas();
    }
}