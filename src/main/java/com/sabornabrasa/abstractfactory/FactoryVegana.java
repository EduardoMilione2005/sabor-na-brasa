package com.sabornabrasa.abstractfactory;

public class FactoryVegana
        implements HamburguerFactory {

    @Override
    public Bebida criarBebida() {

        return new BebidaVegana();
    }

    @Override
    public Batata criarBatata() {

        return new BatataVegana();
    }
}