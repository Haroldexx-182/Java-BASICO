package com.OpenBootCamp;

// es un tipo de estructura de datos que se utiliza para almacenar pares de claves y valores. Cada par de clave-valor
// se conoce como un par de mapeo, y las claves se utilizan para acceder a los valores correspondientes.- //

// La principal diferencia entre un Map y una lista o un array es que en un Map, las claves son únicas y se utilizan
// para acceder a los valores, mientras que en una lista o un array, los índices son utilizados para acceder a los
// elementos.- //

import java.util.Map;               // Import la clase Map
import java.util.HashMap;           // Import la clase HashMap
public class MapMain {

    public static void main(String[] args) {

        // f: Interfaz + (claves, valores) + identificador + asignacion + Pclave para crear un objeto + implementación
        // de mapas que queremos utilizar.
        Map<String, String> personas = new HashMap<>();

        personas.put("1000b", "Nombre Apellido 1");
        personas.put("1001c", "Nombre Apellido 2");
        personas.put("1002d", "Nombre Apellido 3");

        System.out.println(personas);

        // #keySet: devuelve un conjunto de todas las claves que se encuentran en el Map.- //
        for (String claves : personas.keySet()) {
            System.out.println("Claves: " + claves);
        }

        // #values: devuelve una colección de los valores contenidos en el mapa.- //
        for (String valores : personas.values()) {
            System.out.println("Valores: " + valores);
        }

        // #entrySet:  devuelve una colección de entradas (clave-valor) contenidas en el mapa.- //
        for(Map.Entry<String, String> pares : personas.entrySet()) {
            System.out.println("Pares (claves + valores): " + pares.getKey() + " " + pares.getValue());
        }

    }
}
