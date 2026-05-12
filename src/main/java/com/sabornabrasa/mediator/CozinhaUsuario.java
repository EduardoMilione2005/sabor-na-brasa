package com.sabornabrasa.mediator;

public class CozinhaUsuario
        extends Usuario {

    public CozinhaUsuario(
            AtendimentoMediator mediator
    ) {

        super(mediator);
    }

    @Override
    public void enviar(
            String mensagem
    ) {

        System.out.println(
                "Cozinha enviou: "
                        + mensagem
        );

        mediator.enviarMensagem(
                mensagem,
                this
        );
    }

    @Override
    public void receberMensagem(
            String mensagem
    ) {

        System.out.println(
                "Cozinha recebeu: "
                        + mensagem
        );
    }
}