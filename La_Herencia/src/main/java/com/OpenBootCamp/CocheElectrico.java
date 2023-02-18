package com.OpenBootCamp;

// La herencia permite reutilizar codigos entre clases, es decir, tendremos una clase padre, base o superclase
// que nos va a proporcionar un codigo, que con otras clases hijas o derivadas, vamos a poder heredar, de manera
// que no vamos a tener que duplicar codigo, cuando queremos que una clase que es muy parecida a otra, pueda
// añadir mas propiedades y metodos. Cuando existe la necesidad de crear varias clases hijas, pero cada una tiene
// ciertas particularidades que son diferentes entre ellas, pero a su vez tienen ciertas propiedades o metodos
// que son comunes. //
// #extends es la palabra clave de la clase padre, heredando el codigo de esta ultima, y a la vez extender con
// mas cosas.- //
public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {
    }

    public CocheElectrico(String motorElectrico) {
        this.motorElectrico = motorElectrico;
    }

    @Override
    public String toString() {
        return "CocheElectrico{" +
                "motorElectrico='" + motorElectrico + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
