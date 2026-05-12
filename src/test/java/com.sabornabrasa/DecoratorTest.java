package com.sabornabrasa;

import com.sabornabrasa.decorator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DecoratorTest {

    @Test
    void deveAdicionarIngredientesExtras() {

        HamburguerBase hamburguer =
                new HamburguerSimples();

        hamburguer =
                new BaconDecorator(hamburguer);

        hamburguer =
                new QueijoExtraDecorator(
                        hamburguer
                );

        assertEquals(
                "Hambúrguer simples + Bacon + Queijo Extra",
                hamburguer.montar()
        );
    }
}