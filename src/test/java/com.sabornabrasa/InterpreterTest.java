package com.sabornabrasa;

import com.sabornabrasa.interpreter.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class InterpreterTest {

    @Test
    void deveInterpretarPedido() {

        InterpretadorPedido interpretador =
                new InterpretadorPedido();

        Expressao expressao =
                new PedidoExpressao(
                        "X-Burger"
                );

        String resultado =
                interpretador.interpretar(
                        expressao
                );

        assertEquals(
                "Pedido interpretado: X-Burger",
                resultado
        );
    }
}