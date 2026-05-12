package com.sabornabrasa;

import com.sabornabrasa.director.HamburguerDirector;
import com.sabornabrasa.model.Hamburguer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HamburguerDirectorTest {

    @Test
    void deveCriarHamburguerTradicional() {

        HamburguerDirector director = new HamburguerDirector();

        Hamburguer hamburguer =
                director.criarHamburguerTradicional();

        assertEquals("Brioche", hamburguer.getPao());
        assertEquals("Cheddar", hamburguer.getQueijo());
        assertTrue(hamburguer.isBacon());
    }

    @Test
    void deveCriarHamburguerVegano() {

        HamburguerDirector director = new HamburguerDirector();

        Hamburguer hamburguer =
                director.criarHamburguerVegano();

        assertEquals("Integral", hamburguer.getPao());
        assertEquals("Vegano", hamburguer.getQueijo());
        assertFalse(hamburguer.isBacon());
    }
}