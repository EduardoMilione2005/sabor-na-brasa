package com.sabornabrasa.decorator;

public class BaconDecorator
        extends HamburguerDecorator {

    public BaconDecorator(
            HamburguerBase hamburguer
    ) {

        super(hamburguer);
    }

    @Override
    public String montar() {

        return hamburguer.montar()
                + " + Bacon";
    }
}