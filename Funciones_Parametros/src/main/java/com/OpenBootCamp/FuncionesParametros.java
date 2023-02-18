package com.OpenBootCamp;

public class FuncionesParametros {

    public static void main(String[] args) {

        helloWorld();                       // Funcion principal
        helloWorld();

            helloWorld ("Harold");    // Se denomina "Argumento", cuando se agregan "Valores" dentro de los "()",
            helloWorld ("Dennysse");
            helloWorld ("Thiago");

        String Hello = devolverHello();     // Creacion de la funcion "helloWorld" (funcion cuando no este orientada a objetos)
        System.out.println(Hello);
    }

        private static void helloWorld() {
            System.out.println("Hello World desde un Metodo");
        }

            private static void helloWorld(String name) { // Se llama "Parametros" cuando recibe un valor, ejem: "name"
                System.out.println("Hello World " + name);

            }

        private static String devolverHello() {
            return "Hello";
        }
}
