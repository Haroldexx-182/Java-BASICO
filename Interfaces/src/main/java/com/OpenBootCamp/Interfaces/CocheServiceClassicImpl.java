package com.OpenBootCamp.Interfaces;

import com.OpenBootCamp.Coche;
import com.OpenBootCamp.CocheElectrico;
import com.OpenBootCamp.Interfaces.CocheService;
 // Clases Implementadas (#implements): Las clases que implementan interfaces, estan obligadas a proporcionar un body
// a esos metodos, es decir, una implementacion
public class CocheServiceClassicImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {                              // Metodo //
        System.out.println("Creando Coche Clasico");
        return new CocheElectrico();                             // Implementacion: Devolver un codigo
    }

    @Override
    public void destruirCoche(Coche coche) {
        System.out.println("Destruyendo Coche");
    }
}
