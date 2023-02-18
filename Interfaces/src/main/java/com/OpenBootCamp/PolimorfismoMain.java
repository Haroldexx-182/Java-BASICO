package com.OpenBootCamp;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Coche coche = new CocheElectrico();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        if (coche instanceof Coche) {
            System.out.println("Coche");
        }

        if (coche4 instanceof CocheElectrico) {
            System.out.println("Coche Electrico");
        }

        if (coche4 instanceof CocheHibrido) {
            System.out.println("Coche Hibrido");
        }

    }
}

