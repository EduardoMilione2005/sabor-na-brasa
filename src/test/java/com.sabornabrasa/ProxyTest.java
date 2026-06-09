package com.sabornabrasa;

import com.sabornabrasa.proxy.PedidoProxy;
import com.sabornabrasa.proxy.PedidoService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProxyTest {

    @Test
    void deveExecutarPedidoViaProxy() {

        PedidoService proxy =
                new PedidoProxy();

        assertDoesNotThrow(
                proxy::realizarPedido
        );

    }
}