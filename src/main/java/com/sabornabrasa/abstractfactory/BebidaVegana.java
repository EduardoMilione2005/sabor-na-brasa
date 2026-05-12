package com.sabornabrasa.abstractfactory;

public class BebidaVegana implements Bebida {

    @Override
    public void exibirTipo() {

        System.out.println(
                "Suco natural vegano"
        );
    }
}