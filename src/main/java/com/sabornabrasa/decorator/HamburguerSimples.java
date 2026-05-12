package com.sabornabrasa.decorator;

public class HamburguerSimples
        implements HamburguerBase {

    @Override
    public String montar() {

        return "Hambúrguer simples";
    }
}