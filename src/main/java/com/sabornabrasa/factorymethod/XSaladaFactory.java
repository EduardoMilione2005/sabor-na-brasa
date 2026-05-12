package com.sabornabrasa.factorymethod;

public class XSaladaFactory
        extends LancheFactory {

    @Override
    public Lanche criarLanche() {

        return new XSalada();
    }
}