package com.sabornabrasa.proxy;

public class PedidoReal
        implements PedidoService {

    @Override
    public void realizarPedido() {

        System.out.println(
                "Pedido realizado com sucesso"
        );

    }
}