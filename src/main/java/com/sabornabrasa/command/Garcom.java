package com.sabornabrasa.command;

public class Garcom {

    private ComandoPedido comando;

    public void setComando(
            ComandoPedido comando
    ) {

        this.comando = comando;

    }

    public void fazerPedido() {

        comando.executar();

    }

}