package com.OpenBootCamp;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romeo";

        Coche cocheObj = new Coche("azul","subaru","impreza",1298.32,4.8);

        Coche cocheObj2 = new Coche("rojo","honda","civic",1430.45,5.4);

        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.80;
        System.out.println(cocheObj2);

        // cocheElectrico
        CocheElectrico cocheElectrico = new CocheElectrico();

        cocheElectrico.motorElectrico = "Electrico";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Tesla";
        cocheElectrico.modelo = "Model 3";

        System.out.println(cocheElectrico);

        // cocheElectrico2
        CocheElectrico cocheElectrico2 = new CocheElectrico("Rojo","Ford","Mustang",
                1430.45,5.98,"2.0T");
        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);

        // cocheHibrido
        CocheHibrido cocheHibrido = new CocheHibrido();

        cocheHibrido.motorHibrido = "Hibrido";
        cocheHibrido.color = "Negro";
        cocheHibrido.fabricante = "Hyundai";
        cocheHibrido.modelo = "Sonata";

        System.out.println(cocheHibrido);
    }
}

