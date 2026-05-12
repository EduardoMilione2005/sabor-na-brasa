package com.sabornabrasa.abstractfactory;

public class BatataTradicional implements Batata {

    @Override
    public void exibirTipo() {

        System.out.println(
                "Batata frita tradicional"
        );
    }
}