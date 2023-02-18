package com.OpenBootCamp;

public class ArrayFor {

    public static void main(String[] args) {

        // f2: tipo de dato + [] sin espacio + identificador + asignacion #= + entre llaves todos los valores iniciales.- //
        int[] notas = {8,10,5,9,8,7,5,6};

        // Bucle For:  se utiliza para repetir una secuencia de acciones un determinado número de veces.- //
        /* f: bucle + variable de control #int + asignacion valor inicial "i = 0;" + indicar que el valor ira
         incrementandose "<" dentro del bucle hasta el final del Array "notas.length;" longitud total del array +
         cuanto se aumenta la variable, cada vez que se ejecuta una secuencia del bucle "i++" */
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);                 // imprime todas los datos del Array [i]
        }
    }
}
