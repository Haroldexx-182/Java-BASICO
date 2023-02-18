package com.OpenBootCamp;

public class CocheMain {

    public static void main(String[] args) {

        String coche = "alfa romeo";

        // Objeto de la clase padre //
        Coche cocheObj = new CocheHibrido() {            // Cambio de clase (padre a hija) //
        };

        // Objeto de la clase Padre //
        Coche cocheObj2 = new CocheElectrico("rojo","honda","civic",1430.45,
                5.4,"ZAB");            // Cambio de clase (padre a hija) //

        cocheObj2.acelerar(50);
        System.out.println(cocheObj2);

        cocheObj2.peso = 1350.80;
        System.out.println(cocheObj2);

        // cocheElectrico (objeto de la clase hija) //
        CocheElectrico cocheElectrico = new CocheElectrico();        // Clase Hija //

        cocheElectrico.motorElectrico = "Electrico";
        cocheElectrico.color = "Verde";
        cocheElectrico.fabricante = "Tesla";
        cocheElectrico.modelo = "Model 3";

        System.out.println(cocheElectrico);

        // cocheElectrico2 (objeto de la clase hija) //
        CocheElectrico cocheElectrico2 = new CocheElectrico("Rojo","Ford","Mustang",
                1430.45,5.98,"2.0T");         // Clase Hija //
        System.out.println(cocheElectrico2);

        cocheElectrico2.acelerar(50);
        System.out.println(cocheElectrico2);

        // cocheHibrido (objeto de la clase hija) //
        CocheHibrido cocheHibrido = new CocheHibrido();              // Clase Hija //

        cocheHibrido.motorHibrido = "Hibrido";
        cocheHibrido.color = "Negro";
        cocheHibrido.fabricante = "Hyundai";
        cocheHibrido.modelo = "Sonata";

        System.out.println(cocheHibrido);
    }
}

