package com.OpenBootCamp;

import java.util.Arrays;     // Importar la clase de Arrays

public class ArraySort {

    public static void main(String[] args) {

        int[] notas = {8,10,5,9,8,7,5,6};

            // Array Sort: permite ordenar los elementos de un arreglo en un orden específico, por ejemplo,
            // en orden ascendente o descendente.- //
            Arrays.sort(notas);                   // Orden Ascendiente
            for (int num:notas) {
                System.out.println(num);
            }
    }
}

