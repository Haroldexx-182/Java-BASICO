package com.OpenBootCamp;

public class CocheHibrido  extends Coche {

    String motorHibrido;

    public CocheHibrido() {
    }

    public CocheHibrido(String motorHibrido) {
       this.motorHibrido = motorHibrido;
    }

    @Override
    public String toString() {
        return "CocheHibrido{" +
                "motorHibrido='" + motorHibrido + '\'' +
                ", color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
