package com.sabornabrasa;

import com.sabornabrasa.templatemethod.PedidoTradicional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class TemplateMethodTest {

    @Test
    void devePrepararPedidoTradicional() {

        PedidoTradicional pedido =
                new PedidoTradicional();

        assertDoesNotThrow(
                pedido::preparar
        );
    }
}