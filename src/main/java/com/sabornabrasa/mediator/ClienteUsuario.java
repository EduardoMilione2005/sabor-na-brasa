package com.sabornabrasa.mediator;

public class ClienteUsuario
        extends Usuario {

    public ClienteUsuario(
            AtendimentoMediator mediator
    ) {

        super(mediator);
    }

    @Override
    public void enviar(
            String mensagem
    ) {

        System.out.println(
                "Cliente enviou: "
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
                "Cliente recebeu: "
                        + mensagem
        );
    }
}