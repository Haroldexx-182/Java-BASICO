package com.OpenBootCamp;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Dennysse");
        nombres.add("Thiago");
        nombres.add("Aidan");
        nombres.add("Harold");

        System.out.println("#add: " + nombres);

        for(String nombre : nombres) {
            System.out.println("#forEach: " + nombre);
        }

        // Para trabajar con objetos
        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("Hyundai Tucson"));
        coches.add(new Coche("Toyota TrailHunter"));
        coches.add(new Coche("Honda Civic"));

        System.out.println(coches);

        for(Coche coche : coches) {
            System.out.println(coche);
        }
    }
}