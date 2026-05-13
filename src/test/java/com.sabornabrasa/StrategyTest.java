package com.sabornabrasa;

import com.sabornabrasa.strategy.DescontoClienteVip;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StrategyTest {

    @Test
    void deveAplicarDescontoVip() {

        DescontoClienteVip desconto =
                new DescontoClienteVip();

        double valor =
                desconto.aplicarDesconto(
                        100.0
                );

        assertEquals(
                85.0,
                valor
        );
    }
}