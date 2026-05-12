package com.sabornabrasa;

import com.sabornabrasa.abstractfactory.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AbstractFactoryTest {

    @Test
    void deveCriarComboTradicional() {

        HamburguerFactory factory =
                new FactoryTradicional();

        Bebida bebida =
                factory.criarBebida();

        Batata batata =
                factory.criarBatata();

        assertNotNull(bebida);
        assertNotNull(batata);
    }

    @Test
    void deveCriarComboVegano() {

        HamburguerFactory factory =
                new FactoryVegana();

        Bebida bebida =
                factory.criarBebida();

        Batata batata =
                factory.criarBatata();

        assertNotNull(bebida);
        assertNotNull(batata);
    }
}