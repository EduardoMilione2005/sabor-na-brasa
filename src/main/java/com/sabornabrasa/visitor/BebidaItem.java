package com.sabornabrasa.visitor;

public class BebidaItem extends ProdutoVisitor {

    public BebidaItem(
            String nome,
            double preco
    ) {
        super(nome, preco);
    }

    @Override
    public void aceitar(
            Visitor visitor
    ) {
        visitor.visitarBebida(this);
    }
}