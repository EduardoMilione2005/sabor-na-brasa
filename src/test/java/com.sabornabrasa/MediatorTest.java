package com.sabornabrasa;

import com.sabornabrasa.mediator.AtendimentoMediator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MediatorTest {

    @Test
    void deveCriarMediator() {

        AtendimentoMediator mediator =
                new AtendimentoMediator();

        assertNotNull(mediator);
    }
}