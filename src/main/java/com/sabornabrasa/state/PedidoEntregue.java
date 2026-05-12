package com.sabornabrasa.state;

public class PedidoEntregue
        implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {

        System.out.println(
                "Pedido já foi entregue."
        );
    }

    @Override
    public String getStatus() {

        return "ENTREGUE";
    }
}