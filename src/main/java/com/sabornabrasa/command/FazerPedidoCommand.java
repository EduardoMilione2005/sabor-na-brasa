package com.sabornabrasa.command;

public class FazerPedidoCommand
        implements ComandoPedido {

    private Cozinha cozinha;

    public FazerPedidoCommand(
            Cozinha cozinha
    ) {

        this.cozinha = cozinha;

    }

    @Override
    public void executar() {

        cozinha.prepararPedido();

    }
}