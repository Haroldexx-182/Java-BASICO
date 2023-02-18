package com.OpenBootCamp;

public class NotacionMain {

    public static void main(String[] args) {


    // Notaciones:
    // Son un conjunto de Simbolos y Convenciones para escribir codigo de manera clara, legible y estructurada
    // en un leguaje de programacion.- //

        // 1. Punto y Coma #;: Delimita el final de una linea de codigo.
            String mensaje = "Hola Mundo";
            System.out.println("PUNTO Y COMA: " + mensaje);

        // 2. Punto #.: se usa en objetos para acceder a variables, funciones o metodos.
            String mensaje1 = "Hola Mundo";
            System.out.println("PUNTO: " + mensaje.length());

        // 3. Corchetes #[]: Se usan en arrays, delimitan el contenido dentro de ellos
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("CORCHETES: El tercer número es: " + numbers[2]);

        // 4. Parentesis #(): Se usan en funciones, nos ayudan a identificar y almacenar los parametros, tambien nos
        // ayudan a a llamar a las funciones
                /* public static int suma(int a = 5, int b = 10) {
                     return a + b; */

        // 5. Llaves #{}: Se usan en objetos, funciones y estructuras de control (while, if, for), ya que dentro  de
        // ellas, van las instrucciones que se van a revisar, despues de cumplir las condiciones de estas estructuras
            String str = "Hola Mundo";
                if (str.startsWith("Hello")) {
                    System.out.println("LLAVES: La cadena comienza con 'Hello'");
                } else {
                     System.out.println("LLAVES: La cadena no comienza con 'Hello'");
            }
    }
}