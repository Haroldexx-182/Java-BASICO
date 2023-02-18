package com.OpenBootCamp.Interfaces;

import com.OpenBootCamp.Coche;

public class InterfacesMain {

    public static void main(String[] args) {

        CocheService service = new CocheServiceClassicImpl();

        Coche coche = service.crearCocheDemo();

            }
}
