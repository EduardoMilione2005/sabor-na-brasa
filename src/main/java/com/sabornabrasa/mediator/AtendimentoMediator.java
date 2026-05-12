package com.sabornabrasa.mediator;

public class AtendimentoMediator {

    private ClienteUsuario cliente;

    private CozinhaUsuario cozinha;

    public void setCliente(
            ClienteUsuario cliente
    ) {

        this.cliente = cliente;
    }

    public void setCozinha(
            CozinhaUsuario cozinha
    ) {

        this.cozinha = cozinha;
    }

    public void enviarMensagem(
            String mensagem,
            Usuario usuario
    ) {

        if (usuario instanceof ClienteUsuario) {

            cozinha.receberMensagem(
                    mensagem
            );

        } else {

            cliente.receberMensagem(
                    mensagem
            );
        }
    }
}