package com.OpenBootCamp;

public class ArrayForEach {

    public static void main(String[] args) {

        // f2: tipo de dato + [] sin espacio + identificador + asignacion #= + entre llaves todos los valores iniciales.- //
        int[] notas = {8,10,5,9,8,7,5,6};

        // Bucle ForEach: se utiliza para iterar a través de una colección de elementos como una lista, un arreglo, etc.
        // es muy útil cuando deseas realizar una operación en cada uno de los elementos de una colección sin tener que
        // preocuparte por la gestión manual del índice o contador.- //
            for (int item:notas) {
            System.out.println(item);                 // imprime todas los datos del Array (item)
        }
    }
}

