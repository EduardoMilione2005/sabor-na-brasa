package com.sabornabrasa.interpreter;

public class PedidoExpressao
        implements Expressao {

    private final String pedido;

    public PedidoExpressao(
            String pedido
    ) {

        this.pedido = pedido;

    }

    @Override
    public String interpretar() {

        return "Pedido interpretado: "
                + pedido;

    }
}