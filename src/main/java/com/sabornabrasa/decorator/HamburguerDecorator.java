package com.sabornabrasa.decorator;

public abstract class HamburguerDecorator
        implements HamburguerBase {

    protected HamburguerBase hamburguer;

    public HamburguerDecorator(
            HamburguerBase hamburguer
    ) {

        this.hamburguer = hamburguer;
    }
}