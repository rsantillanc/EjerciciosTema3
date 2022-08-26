package com.company;

public class Main {

    public static void main(String[] args) {
        sum(10, 20, 30);
        Coche miCoche = new Coche();
        miCoche.incrementarPuertas();
        System.out.println("Las puertas de mi coche son: " + miCoche.puertas);
    }


    static void sum(int p1, int p2, int p3) {
        System.out.println("Mi suma es: " + (p1 + p2 + p3));
    }
}

class Coche {
    int puertas = 0;

    void incrementarPuertas() {
        puertas++;
    }
}