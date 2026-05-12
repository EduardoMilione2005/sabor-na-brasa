package com.sabornabrasa.factorymethod;

public class XBurger implements Lanche {

    @Override
    public void preparar() {

        System.out.println(
                "Preparando X-Burger"
        );
    }
}