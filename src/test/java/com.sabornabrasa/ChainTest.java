package com.sabornabrasa;

import com.sabornabrasa.chain.Atendente;
import com.sabornabrasa.chain.Dono;
import com.sabornabrasa.chain.Gerente;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ChainTest {

    @Test
    void deveCriarFluxoDeAtendimento() {

        Atendente atendente = new Atendente();
        Gerente gerente = new Gerente();
        Dono dono = new Dono();

        atendente.setProximo(gerente);
        gerente.setProximo(dono);

        assertNotNull(atendente);
        assertNotNull(gerente);
        assertNotNull(dono);
    }
}