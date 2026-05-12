package com.sabornabrasa.abstractfactory;

public class BebidaTradicional implements Bebida {

    @Override
    public void exibirTipo() {

        System.out.println(
                "Refrigerante tradicional"
        );
    }
}