package com.sabornabrasa.memento;

import java.util.ArrayList;
import java.util.List;

public class HistoricoPedido {

    private final List<PedidoSalvo>
            historico =
            new ArrayList<>();

    public void salvar(
            PedidoSalvo pedido
    ) {

        historico.add(pedido);
    }

    public PedidoSalvo obter(
            int indice
    ) {

        return historico.get(indice);
    }
}