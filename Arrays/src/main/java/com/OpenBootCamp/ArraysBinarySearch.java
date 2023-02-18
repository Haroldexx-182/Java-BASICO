package com.OpenBootCamp;

import java.util.Arrays;       // Importar la clase de Arrays

public class ArraysBinarySearch {

    public static void main(String[] args) {

        int[] notas = {8,10,5,9,8,7,5,6};

        // Array BinarySearch: se utiliza para buscar un elemento en una secuencia ordenada de elementos.- //
           int buscar = Arrays.binarySearch(notas, 9);
           System.out.println("El indice del numero 9 es: " + buscar);

        }
}

