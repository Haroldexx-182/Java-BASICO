package com.OpenBootCamp;

// La clase del Objeto creada, actua como una pantilla, que ytulizaran los objetos //
public class Coche {

    // Propiedades o Atributos: Son todas aquellas caracteristicas que tendria un Objeto y varia de un Objeto a otro  //
    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // Constructores: Son metodos especiales que nos van a permitir crear "Objetos" de la clase. Si no se añade ningun
    // constructor, habra por defecto un constructor vacio, que permitira crear "Objetos" sin asignar valores a los
    //  parametros "color, fabricamte, modelo, etc. (se pueden crear otros constructores "sobrecarga de funciones") //

    public Coche(){  // Constructor vacio o por defecto (siempre debe existir) //
    }

    public Coche(String color, String fabricante, String modelo, Double peso, Double largo){  // (parametros) //
        this.color = color;                        // Con #this asignamos el valor de color a la variable color //
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }



    // Metodos o Comportamientos (se pueden agregar otros Metodos) //
    public void acelerar(Integer cantidad){
        if(cantidad > 0 && cantidad <= 120){}         // #if - Estructura de control para limitar velocidad //
        this.velocidad += cantidad;
    }

    // Metodo #toString: para generar un #sout, imprimir valor de las variables (propiedades)
    // click drcoh +Generate + #toString + Ok //
    @Override
    public String toString() {
        return "Coche{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}