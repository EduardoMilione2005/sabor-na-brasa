package com.sabornabrasa.abstractfactory;

public class BatataVegana implements Batata {

    @Override
    public void exibirTipo() {

        System.out.println(
                "Batata rústica vegana"
        );
    }
}