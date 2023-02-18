package com.OpenBootCamp.Interfaces;

import com.OpenBootCamp.Coche;
import com.OpenBootCamp.CocheElectrico;
import com.OpenBootCamp.Interfaces.CocheService;

public class CocheServiceSportImpl implements CocheService {

    @Override
    public Coche crearCocheDemo() {
        System.out.println("Creando Coche Deportivo");
        return new CocheElectrico();
    }

    @Override
    public void destruirCoche(Coche coche) {

    }
}
