package com.OpenBootCamp;

public class SwitchCase {

    public static void main(String[] args) {

        String clima = "soleado";               // Variable "String" que veamos cual es el clima //

        switch (clima) {                        // el "switch" va a evaluar el clima //

            case "soleado":                     // el "case" va a casos para poder evaluar el clima //
                System.out.println("El tiempo esta Soleado"); // en cada caso hariamos el codigo que corresponda imprimir //
                break;                                        // "break" para romper el caso y salir de el "switch" //
            case "nublado":                                   // aqui programamos otro caso //
                System.out.println("El tiempo esta Nublado");
                break;
            default: // "default" Debemos simpre programar un caso por defecto, si no encuentra ninguno de los textos //
                System.out.println("No se ha podido identificar el Clima"); // con una respuesta
                break;
        }
    }
}
