package com.OpenBootCamp;

public class VariablesTiposDatos {

    public static void main(String[] args) {

        // f: "TipoDato=PalabraReservada" + "Identificador" + "SimboloAsignacion" + "Valor" //

        /* Tipos de Dato: (Los "Datos Primitivos" comienzan con MIN) */

            // Enteros:
            // f:(PR + ID + ASIG + VALOR)
            byte number1 = 1;  // 1 byte  - Para formatos numericos muy pequeños
            short number2 = 2; // 2 byte  - Para formatos numericos muy pequeños
            int number3 = 3;   // 4 byte  - Mayor capacidad
            long number4 = 4l;  // 8 byte - Mayor capacidad ("long" con l en MIN representa una VARIABLE)

            // Punto Flotante:
            float decimal1 = 4.9f;
            double decimal2 = 9.99d;

            // Caracteres:
            char caracter1 = 'a';

            // Booleanos
            boolean verdadero = true;
            boolean falso = false;

            /* Los "Datos Complejos" comienzan con MAY */
            // Cadenas de texto
            String nombre = "Harold";
            String apellido = "Barrios";

            // Tipos envoltorio
            Integer numero = null;        //Para cuando quedan casillas en blanco, el dato debe ser nulo //
            Long numero2 = 2L;            // "Long" con L en MAY representa un OBJETO


        /*
         Los Identificadores deben cumplir cierta nomenclatura, por ejemplo:
         1) Que sea un nombre descriptivo;
         2) Que no sea una Palabra Reservada;
         3) No se puede utilizar Acentos;
         4) No se puede utilizar Ñ;
         5) Si esta compuesto por varias palabras, se debe usar la sintaxis camelCase, en el cual tenemos que unir las
            palabras y la segunda palabra debe iniciar en Mayusculas;
         6) Por MAYUSCULAS solo comienzan las Clases y los Datos Complejos.-
         */
    }
}
