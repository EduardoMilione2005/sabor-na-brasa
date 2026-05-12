package com.sabornabrasa.state;

public class PedidoPreparando
        implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {

        System.out.println(
                "Pedido saiu do estado PREPARANDO."
        );

        pedido.setEstado(
                new PedidoEntregue()
        );
    }

    @Override
    public String getStatus() {

        return "PREPARANDO";
    }
}