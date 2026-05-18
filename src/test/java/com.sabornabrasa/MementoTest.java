package com.sabornabrasa;

import com.sabornabrasa.memento.HistoricoPedido;
import com.sabornabrasa.memento.PedidoMemento;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MementoTest {

    @Test
    void deveRestaurarEstadoAnterior() {

        PedidoMemento pedido =
                new PedidoMemento();

        HistoricoPedido historico =
                new HistoricoPedido();

        pedido.setEstado(
                "Recebido"
        );

        historico.salvar(
                pedido.salvar()
        );

        pedido.setEstado(
                "Em preparo"
        );

        pedido.restaurar(
                historico.obter(0)
        );

        assertEquals(
                "Recebido",
                pedido.getEstado()
        );
    }
}