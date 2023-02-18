package com.OpenBootCamp;

public class StringMain {

    public static void main(String[] args) {

        // La Clase String y sus metodos:

          // 1. #length():
          // Devuelve el tamaño de la cadena
            String mensaje = "  Hola Mundo  ";
                System.out.println("#length(): " + mensaje.length());

          // 2. #toUpperCase():
          // Devuelve la cadena en mayúsculas
            String mensajeMAY = mensaje.toUpperCase();
                System.out.println("#toUpperCase: " + mensajeMAY);

          // 3. #trim():
          // Devuelve la cadena sin los espacios
            System.out.println("#trim: " + mensajeMAY.trim());
                mensajeMAY = mensajeMAY.trim();

          // 4. #equals():
          // Comprueba si dos cadenas son iguales
            String otro = "HOLA MUNDO";
                if (mensajeMAY.equals(otro)) {     // #equalsIgnoreCase omitiria MAY al comparar
                    System.out.println("#equals(): Verdadero!!");
                }

          // 5. #startsWith(""):
          // Verifica si la cadena comienza con un(os) texto, numero, etc. especifico
            String str = "Hola Mundo";
                 if (str.startsWith("Hello")) {
                    System.out.println("#startsWith: La cadena comienza con 'Hello'");
                } else {
                    System.out.println("#startsWith: La cadena no comienza con 'Hello'");
        }
           // 6. #endsWith(""):
           // Verifica termina con un(os) texto, numero, etc. especifico
             /* String str = "Hola Mundo!";
                 if (str.endsWith("!")) {
                  System.out.println("#endsWith: La cadena termina con '!'");
                 } else {
                  System.out.println("#endsWith: La cadena no termina con '!'");
                 } */

            // 7. #indexOf(""):
            // Obtiene la posición de un(os) caracter o subcadena en una cadena de caracteres
              /* String str = "Hello, World!";
               int index = str.indexOf("o");
                System.out.println("La primera posición de 'o' en la cadena es: " + index); */


            // 8. #substring(1,5):
            // Obtiene una subcadena de una cadena
              /* String str = "Hello, World!";
              String subStr = str.substring(1, 5);
              System.out.println("La subcadena es: " + subStr); */

            // 9. #compareTo:
            // Comprueba si dos cadenas son iguales
                /* String otro = "HOLA MUNDO";
                    if (mensajeMAY.compareTo(otro) == 0) {
                        System.out.println("#compareTo: Verdadero!!"); */
                }
}
