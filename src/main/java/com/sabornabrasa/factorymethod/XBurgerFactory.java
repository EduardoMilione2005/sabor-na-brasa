package com.sabornabrasa.factorymethod;

public class XBurgerFactory
        extends LancheFactory {

    @Override
    public Lanche criarLanche() {

        return new XBurger();
    }
}