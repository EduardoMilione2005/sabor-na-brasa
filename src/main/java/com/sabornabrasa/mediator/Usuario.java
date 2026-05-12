package com.sabornabrasa.mediator;

public abstract class Usuario {

    protected AtendimentoMediator mediator;

    public Usuario(
            AtendimentoMediator mediator
    ) {

        this.mediator = mediator;
    }

    public abstract void enviar(
            String mensagem
    );

    public abstract void receberMensagem(
            String mensagem
    );
}