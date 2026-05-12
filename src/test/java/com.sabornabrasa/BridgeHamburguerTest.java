package com.sabornabrasa;

import com.sabornabrasa.bridge.IngredienteTradicional;
import com.sabornabrasa.bridge.IngredienteVegano;
import com.sabornabrasa.builder.HamburguerPremium;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BridgeHamburguerTest {

    @Test
    void deveCriarHamburguerPremiumTradicional() {

        HamburguerPremium hamburguer =
                new HamburguerPremium(
                        new IngredienteTradicional()
                );

        assertNotNull(hamburguer);
    }

    @Test
    void deveCriarHamburguerPremiumVegano() {

        HamburguerPremium hamburguer =
                new HamburguerPremium(
                        new IngredienteVegano()
                );

        assertNotNull(hamburguer);
    }
}