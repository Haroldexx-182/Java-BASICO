package com.OpenBootCamp;

public class CocheMain {

    // Metodo #main es el punto de entrada del programa //
    public static void main(String[] args) {

        // Creacion de Variable: Palabra Reservado + Identificador + = + Valor Asignado //
        String coche = "alfa romeo";

        // Creacion de Objeto: Palabra Reservada (tipo de dato x clase creada) + Identificador + = + Operador #new (nos
        // va a permitir crear un objeto a partir de una clase) + Nombre de la Clase creada (= Objeto creado) y entre
        // parentecis SI EXISTEN PROPIEDADES (control + p = parametros a enviar), hay que enviar esos datos al objeto
        // creado, Si NO existen propiedades, los aprentesis van vacios. A los Objetos creados, tambien se les conoce
        // como "INSTANCIAS" de la clase creada, es decir, estamos instanciando una clase.- //
        Coche cocheObj = new Coche("azul","subaru","impreza",1298.32,4.8);

        // cada Objeto tendra sus propiedades particulares para ese Objeto en concreto (podremos crear tantos Objetos
        // como quisieramos.- //
        Coche cocheObj2 = new Coche("rojo","honda","civic",1430.45,5.4);

        cocheObj2.acelerar(50); // podemos ejecutar las propiedades o metodos que tenga la(s) clase(s).- //
        System.out.println(cocheObj2);  // #sout para Imprimir.- //

        cocheObj2.peso = 1350.80;       // podemos cambiar los valores de las propiedades que tenga la(s) clase.- //
        System.out.println(cocheObj2);

        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Electrico";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Tesla";
        cocheElectrico.modelo = "Model 3";

        System.out.println(cocheElectrico);

        CocheHibrido cocheHibrido = new CocheHibrido();

        cocheHibrido.motorHibrido = "Hibrido";
        cocheHibrido.color = "Negro";
        cocheHibrido.fabricante = "Hyundai";
        cocheHibrido.modelo = "Sonata";

        System.out.println(cocheHibrido);
    }
}

