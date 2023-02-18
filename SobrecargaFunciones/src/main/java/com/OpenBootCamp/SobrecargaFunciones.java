package com.OpenBootCamp;

public class SobrecargaFunciones {

    public static void main(String[] args) {

        holaMundo();
            holaMundo("Harold");
                holaMundo(4);

    }

    /*
    Se puede implementar la "Sobrecarga de Funciones" mientras los parametros no sean copia fiel y exacta, a menos que
    tengan diferentes parametros, no estan duplicadas, en eso consisten las "Sobrecargas". De esta manera, podemos
    "Sobrecargar" una funcion tantas veces como necesitemos, siempre y cuando los argumentos recibidos sean diferentes.-
     */
    public static void holaMundo() {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }

        private static void holaMundo(String name) {
            System.out.println("Hola Mundo " + name);
        }

            private static void holaMundo(Integer number) {
                System.out.println("El numero es: " + number);
            }
}
