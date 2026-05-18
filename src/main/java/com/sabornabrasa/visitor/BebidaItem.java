package com.sabornabrasa.visitor;

public class BebidaItem
        implements Item {

    private final String nome;

    private final double preco;

    public BebidaItem(
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

    @Override
    public void aceitar(
            Visitor visitor
    ) {

        visitor.visitarBebida(
                this
        );
    }
}