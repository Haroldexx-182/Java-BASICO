package com.OpenBootCamp;

public class CocheElectrico extends Coche {

    String motorElectrico;

    public CocheElectrico() {
    }
    public CocheElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public CocheElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }
    // Sobreescritura de metodo.- //
    @Override // esto es una "Anotacion": aporta metadatos a los metodos o clases para verificar si estas sobreescribiendo //
    public void acelerar(Integer cantidad) {              // Sobreescritura de metodo. //
        Integer cantidadAjustada = cantidad * 2;
        super.acelerar(cantidadAjustada);                 // Sobrecarga, para no reescribir el codigo.- //
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
