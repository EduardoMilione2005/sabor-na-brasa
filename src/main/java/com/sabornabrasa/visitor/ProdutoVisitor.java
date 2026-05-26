package com.sabornabrasa.visitor;

public abstract class ProdutoVisitor implements Item {

    protected String nome;
    protected double preco;

    public ProdutoVisitor(
            String nome,
            double preco
    ) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}