package com.sabornabrasa.proxy;

public class PedidoProxy
        implements PedidoService {

    private PedidoReal pedido;

    @Override
    public void realizarPedido() {

        if (pedido == null) {

            pedido =
                    new PedidoReal();

        }

        System.out.println(
                "Verificando autorização..."
        );

        pedido.realizarPedido();

    }
}