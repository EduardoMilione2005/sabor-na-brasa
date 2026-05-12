package com.sabornabrasa.decorator;

public class QueijoExtraDecorator
        extends HamburguerDecorator {

    public QueijoExtraDecorator(
            HamburguerBase hamburguer
    ) {

        super(hamburguer);
    }

    @Override
    public String montar() {

        return hamburguer.montar()
                + " + Queijo Extra";
    }
}