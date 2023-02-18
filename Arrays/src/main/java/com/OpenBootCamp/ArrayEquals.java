package com.OpenBootCamp;

import java.util.Arrays;                // Importar la clase de Arrays

public class ArrayEquals {

    public static void main(String[] args) {

        int[] notas1 = {8,10,5,9,8,7,5,6};
        int[] notas2 = {8,10,5,9,8,7,5,6};
        int[] notas3 = {5,4,3,2,1,0,9,8,7};

        // Metodo #Equals: se utiliza para comparar si dos Arrays son iguales en términos de sus elementos.- //
        boolean resultado = Arrays.equals(notas1, notas2);
            System.out.println("Notas1 y Notas2 son iguales: " + resultado);

        resultado = Arrays.equals(notas1, notas3);
            System.out.println("Notas1 y Notas3 son iguales: " + resultado);
    }
}

