package com.OpenBootCamp;

// Arrays: es un tipo especial de vector de variables, ya que es una estructura de datos que permite almacenar
// múltiples valores de un mismo tipo y están organizados en una secuencia, en una sola estructura.
public class ArraysMain {

    public static void main(String[] args) {
        // Array Unidimensional (una unica dimension):
        // Los Arrays se compondra principalmente de dos valores, el primero es el tamaño de la secuencia (orden) y el
        // segundo es el valor para cada una de estas ordenes.- //
        // f1: tipo de dato + [] sin espacio + identificador + asignacion #= + palabra reservada + total ordenes.- //
        int[] notas = new int[10];   // Posicion maxima "[10]"

        notas[0] = 8;          // [0] los Arrays siempre comienzan por la posicion cero "0"
        notas[1] = 10;
        notas[2] = 5;
        notas[3] = 9;
        notas[4] = 8;
        notas[5] = 7;
        notas[6] = 5;
        notas[7] = 6;
        notas[8] = 10;
        notas[9] = 5;
        System.out.println(notas[0]);     // imprimir: (identificador + [poscicion])
    }




}
