package com.OpenBootCamp;

public class Coche {

    String name = "nombre de coche";

    public Coche() {}
    public Coche(String name){
        this.name = name;
    }

    // #toSpring:  un método predefinido en Java que pertenece a la clase Object y es heredado por todas las clases
    // en Java. El objetivo de este método es devolver una representación en forma de cadena de texto de un objeto.
    @Override
    public String toString() {
        return "Coche{" +
                "name='" + name + '\'' +
                '}';
    }
}
