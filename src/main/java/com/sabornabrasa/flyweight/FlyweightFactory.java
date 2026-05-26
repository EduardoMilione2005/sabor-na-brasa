package com.sabornabrasa.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

    private static final Map<String, IngredienteFlyweight>
            ingredientes = new HashMap<>();

    public static IngredienteFlyweight getIngrediente(
            String tipo
    ) {

        IngredienteFlyweight ingrediente =
                ingredientes.get(tipo);

        if (ingrediente == null) {

            ingrediente =
                    new IngredienteConcreto(tipo);

            ingredientes.put(
                    tipo,
                    ingrediente
            );
        }

        return ingrediente;
    }
}