package com.OpenBootCamp;


public class PolimorfismoMain {

    public static void main(String[] args) {

        // cuando NO utilizamos polimorfismo, trabajamos con los tipos de datos concretos, es decir, la clase
        // concreta, clase hijao la clase derivada.- //
        Coche coche = new Coche();

        CocheElectrico coche2 = new CocheElectrico();

        CocheHibrido coche3 = new CocheHibrido();

        // Polimorfismo:Cuando utilizamos polimorfismo, estamos empleando la clase que esta por encima, con el
        // objetivo de tratar a todos los objetos por igual.- //

        Coche coche4 = new CocheElectrico();

        Coche coche5 = new CocheHibrido();

        if (coche instanceof Coche) {
            System.out.println("Coche");
        }

        if (coche4 instanceof CocheElectrico) {   // #instanceof: palabra reservada de comparacion.- //
            System.out.println("Coche Electrico");
        }

        if (coche4 instanceof CocheHibrido) {
            System.out.println("Coche Hibrido");
        }

    }
}
