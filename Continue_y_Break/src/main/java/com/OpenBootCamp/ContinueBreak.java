package com.OpenBootCamp;

public class ContinueBreak {

    public static void main(String[] args) {

        int Contador = 0;
        while(Contador < 10){

            Contador++;                   // Condicion
            if(Contador == 6)             // cuando la condicion tienen una linea de codigo en los (), se omite {},
                continue;                 // "continue" salta el valor "6" y continua a la sguiente iteracion //
                break;                    // "break" rompe el flujo de ejecucion y sale del Bucle e imprime; //


            System.out.println(Contador + " Hello World");

        }

        System.out.println("    Fin");
    }
}
/*
Hay que entender como funciona el codigo, y saber dodne colocar las sintaxis, para que realmente tenga sentido
y surta efectos, y no se coloque en algun sitio que sea totalmente innecesario.-
 */