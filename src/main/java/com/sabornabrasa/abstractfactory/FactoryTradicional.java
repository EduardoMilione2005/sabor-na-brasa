package com.sabornabrasa.abstractfactory;

public class FactoryTradicional
        implements HamburguerFactory {

    @Override
    public Bebida criarBebida() {

        return new BebidaTradicional();
    }

    @Override
    public Batata criarBatata() {

        return new BatataTradicional();
    }
}