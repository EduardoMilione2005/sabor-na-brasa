package com.sabornabrasa.factorymethod;

public class XSalada implements Lanche {

    @Override
    public void preparar() {

        System.out.println(
                "Preparando X-Salada"
        );
    }
}