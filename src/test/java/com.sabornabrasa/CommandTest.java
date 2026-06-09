package com.sabornabrasa;

import com.sabornabrasa.command.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {

    @Test
    void deveExecutarPedido() {

        Cozinha cozinha =
                new Cozinha();

        ComandoPedido comando =
                new FazerPedidoCommand(
                        cozinha
                );

        Garcom garcom =
                new Garcom();

        garcom.setComando(
                comando
        );

        assertDoesNotThrow(
                garcom::fazerPedido
        );
    }
}