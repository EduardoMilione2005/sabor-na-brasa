package com.sabornabrasa.state;

public class Pedido {

    private EstadoPedido estado;

    public Pedido() {

        estado = new PedidoRecebido();
    }

    public void setEstado(
            EstadoPedido estado
    ) {

        this.estado = estado;
    }

    public void avancar() {

        estado.avancar(this);
    }

    public void exibirStatus() {

        System.out.println(
                "Status do pedido: "
                        + estado.getStatus()
        );
    }
}