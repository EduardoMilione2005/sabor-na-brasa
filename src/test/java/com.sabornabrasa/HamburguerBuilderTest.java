package com.sabornabrasa;

import com.sabornabrasa.builder.HamburguerBuilder;
import com.sabornabrasa.model.Hamburguer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HamburguerBuilderTest {

    @Test
    void deveCriarHamburguerPersonalizado() {

        Hamburguer hamburguer = new HamburguerBuilder()
                .adicionarPao("Australiano")
                .adicionarCarne("Picanha")
                .adicionarQueijo("Cheddar")
                .adicionarBacon(true)
                .adicionarSalada(true)
                .adicionarMolho("Especial")
                .build();

        assertEquals("Australiano", hamburguer.getPao());
        assertEquals("Picanha", hamburguer.getCarne());
        assertEquals("Cheddar", hamburguer.getQueijo());
        assertTrue(hamburguer.isBacon());
        assertTrue(hamburguer.isSalada());
        assertEquals("Especial", hamburguer.getMolho());
    }
}