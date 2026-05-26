package com.sabornabrasa;

import com.sabornabrasa.flyweight.FlyweightFactory;
import com.sabornabrasa.flyweight.IngredienteFlyweight;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FlyweightTest {

    @Test
    void deveReutilizarMesmoObjeto() {

        IngredienteFlyweight ingrediente1 =
                FlyweightFactory.getIngrediente(
                        "Queijo"
                );

        IngredienteFlyweight ingrediente2 =
                FlyweightFactory.getIngrediente(
                        "Queijo"
                );

        assertSame(
                ingrediente1,
                ingrediente2
        );
    }
}