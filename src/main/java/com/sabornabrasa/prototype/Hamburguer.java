package com.sabornabrasa.prototype;

public class Hamburguer extends HamburguerPrototype {

    public Hamburguer(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public HamburguerPrototype clone() {
        return new Hamburguer(this.nome, this.preco);
    }
}