package com.sabornabrasa.prototype;

public abstract class HamburguerPrototype implements Cloneable {

    protected String nome;
    protected double preco;

    public HamburguerPrototype(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public abstract HamburguerPrototype clone();
}