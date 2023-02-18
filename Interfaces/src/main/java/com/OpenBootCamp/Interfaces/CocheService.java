package com.OpenBootCamp.Interfaces;

import com.OpenBootCamp.Coche;

// #interface (Interfaces): es un mecanismo de abstraccion, que nos va a permitir desacoplar el codigo y hacerlo mucho
// mas flexible. La interfaz va a definir un contrato (metodos) de lo que hay que hacer, y va a tener que ser una clase
// quien implemente esa interfaz de como lo va hacer, de tal manera que, a partir de una misma interfaz, podriamos
// tener multiples implementaciones de la misma.- //
public interface CocheService {

    public Coche crearCocheDemo();  // Los metodos de la Interfaz no pueden tener "Body {}".- //

    public void destruirCoche(Coche coche);  // Nuevo metodo: Al ser creado, debemos obligar a las clases que lo
}                                            // implementen. //
