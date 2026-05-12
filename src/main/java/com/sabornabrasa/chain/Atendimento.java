package com.sabornabrasa.chain;

public abstract class Atendimento {

    protected Atendimento proximo;

    public void setProximo(Atendimento proximo) {

        this.proximo = proximo;
    }

    public abstract void atender(String problema);
}