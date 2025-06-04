package Animales;

public class Perro extends Animal {
    String raza;
    int vacunas;

    Perro(String tipo, String raza, int edad) {
        super(tipo, edad);
        this.raza = raza;
        this.vacunas = (edad > 0 && edad <= 3) ? 3 : 7;
    }

    void ladrar() {
        System.out.println("Guau guau - Soy un " + raza);
    }

    void mostrarEdadVacunas() {
        System.out.println("el perro tiene " + edad + " años");
        System.out.println("el perro " + etapa + " tiene " + vacunas + " vacunas");
    }
}
