package Animales;

public class Animal {
    String tipo;
    int edad;
    String etapa;

    Animal(String tipo, int edad) {
        this.tipo = tipo;
        this.edad = edad;
        this.etapa = (edad > 0 && edad <= 3) ? "cachorro" : "adulto";
    }

    public void describir() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Etapa: " + etapa);
    }
}
