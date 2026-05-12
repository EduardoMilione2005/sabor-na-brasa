package com.sabornabrasa.state;

public class PedidoRecebido
        implements EstadoPedido {

    @Override
    public void avancar(Pedido pedido) {

        System.out.println(
                "Pedido saiu do estado RECEBIDO."
        );

        pedido.setEstado(
                new PedidoPreparando()
        );
    }

    @Override
    public String getStatus() {

        return "RECEBIDO";
    }
}