package com.sabornabrasa;

import com.sabornabrasa.state.Pedido;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StateTest {

    @Test
    void deveCriarPedido() {

        Pedido pedido = new Pedido();

        assertNotNull(pedido);
    }
}