package com.sabornabrasa.state;

public interface EstadoPedido {

    void avancar(Pedido pedido);

    String getStatus();
}