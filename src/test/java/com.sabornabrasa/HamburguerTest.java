package com.sabornabrasa;

import com.sabornabrasa.builder.HamburguerBuilder;
import com.sabornabrasa.builder.HamburguerDirector;
import com.sabornabrasa.builder.Hamburguer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HamburguerTest {

    @Test
    void deveCriarHamburguerPersonalizado() {

        Hamburguer hamburguer = new HamburguerBuilder()
                .adicionarPao("Australiano")
                .adicionarCarne("Picanha")
                .adicionarQueijo("Prato")
                .adicionarBacon(true)
                .adicionarSalada(true)
                .adicionarMolho("Especial")
                .build();

        assertEquals("Australiano", hamburguer.getPao());
        assertEquals("Picanha", hamburguer.getCarne());
        assertEquals("Prato", hamburguer.getQueijo());
        assertTrue(hamburguer.isBacon());
        assertTrue(hamburguer.isSalada());
        assertEquals("Especial", hamburguer.getMolho());
    }

    @Test
    void deveCriarHamburguerTradicional() {

        HamburguerDirector director = new HamburguerDirector();
        Hamburguer hamburguer = director.criarHamburguerTradicional();

        assertEquals("Brioche", hamburguer.getPao());
        assertEquals("Cheddar", hamburguer.getQueijo());
        assertTrue(hamburguer.isBacon());
    }

    @Test
    void deveCriarHamburguerVegano() {

        HamburguerDirector director = new HamburguerDirector();
        Hamburguer hamburguer = director.criarHamburguerVegano();

        assertEquals("Integral", hamburguer.getPao());
        assertEquals("Vegano", hamburguer.getQueijo());
        assertFalse(hamburguer.isBacon());
    }
}