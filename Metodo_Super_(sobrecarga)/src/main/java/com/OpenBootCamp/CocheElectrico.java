package com.OpenBootCamp;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {
    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    // Nuevo constructor mediante sobrecarga, siendo esta ultima, cuando duplicamos un metodo pero utilizamos diferentes
    // propiedades o metodos, para que no sea 100% iguales, y lo considere un duplicado.- //
    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo); // se reutiliza el codigo con el metodo #super. Nos permite
        this.motorElectrico = motorElectrico;          // invocar a unas propiedades o metodos de la clase padre. Luego
    }                                                  // se asigna una propiedad o metodo especifoca de la clase hija //

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
