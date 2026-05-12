package com.sabornabrasa;

import com.sabornabrasa.observer.Cliente;
import com.sabornabrasa.observer.PedidoLoja;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObserverTest {

    @Test
    void deveAdicionarObservador() {

        PedidoLoja pedido =
                new PedidoLoja();

        Cliente cliente =
                new Cliente("Carlos");

        pedido.adicionarObservador(
                cliente
        );

        assertNotNull(cliente);
    }
}