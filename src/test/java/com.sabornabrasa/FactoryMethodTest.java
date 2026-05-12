package com.sabornabrasa;

import com.sabornabrasa.factorymethod.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactoryMethodTest {

    @Test
    void deveCriarXBurger() {

        LancheFactory factory =
                new XBurgerFactory();

        Lanche lanche =
                factory.criarLanche();

        assertNotNull(lanche);
    }

    @Test
    void deveCriarXSalada() {

        LancheFactory factory =
                new XSaladaFactory();

        Lanche lanche =
                factory.criarLanche();

        assertNotNull(lanche);
    }
}