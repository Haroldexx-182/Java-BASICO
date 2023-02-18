package com.OpenBootCamp;

import java.util.ArrayList;
import java.util.List;              // Agregar clase Array List

public class ListaMain {

    public static void main(String[] args) {

        // ArrayList: permite almacenar objetos de forma dinámica. Se pueden agregar, eliminar y acceder a elementos
        // en un ArrayList sin necesidad de especificar su tamaño, ya que aumenta o disminuye automáticamente según se
        // agreguen o eliminen elementos. Existen varios metodos de listas, como #size (tamaño de una lista), #isEmpy,
        // #contains (comprueba si existe un elemento dentro de una lista), #toArray (convertir un Array a estatico),
        // #add (agregar elementos a la lista), #remove (remover elementos de la lista), etc.- //
        List<String> nombres = new ArrayList<>();        // Creacion lista dinamica

        nombres.add("Dennysse");                         // #add: agrega elementos a la lista
        nombres.add("Thiago");
        nombres.add("Aidan");
        nombres.add("Harold");

        System.out.println("#add: " + nombres);

        for(String nombre : nombres) {                     // #forEach: recorre o itera la lista (Enlistar)
            System.out.println("#forEach: " + nombre);
        }

        // Para trabajar con objetos
        List<Coche> coches = new ArrayList<>();

        coches.add(new Coche("Hyundai Tucson"));
        coches.add(new Coche("Toyota TrailHunter"));
        coches.add(new Coche("Honda Civic"));

        System.out.println(coches);                        // Imprime solo referencia en memoria

        for(Coche coche : coches) {                        // #forEach: recorre o itera la lista (Enllstar)
            System.out.println(coche);
        }
    }
}



