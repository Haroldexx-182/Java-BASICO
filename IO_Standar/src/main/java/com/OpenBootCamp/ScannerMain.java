package com.OpenBootCamp;

import java.util.Scanner;

// Standard I/O" (Entrada/Salida estándar) es un término que se refiere a las formas estándar de entrada y salida en un
// sistema operativo, como el teclado y la consola para la entrada y la pantalla para la salida.- //

// Algunas de las clases más comunes incluyen System.in para la entrada estándar, System.out para la salida estándar,
// y la clase BufferedReader para la lectura de archivos de texto.- //
public class ScannerMain {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);            // Con #System.in se lee
        System.out.println("Introduce un nombre:");
        String nombre = scanner.nextLine();                   // Con #System.out se escribe
        System.out.println("Introduce un numero:");
        int numero = scanner.nextInt();

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El numero introducido es: " + numero);

        System.out.println("Hola Mundo");
    }
}
