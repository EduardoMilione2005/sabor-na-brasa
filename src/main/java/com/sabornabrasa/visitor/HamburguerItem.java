package com.sabornabrasa.visitor;

public class HamburguerItem extends ProdutoVisitor {

    public HamburguerItem(
            String nome,
            double preco
    ) {
        super(nome, preco);
    }

    @Override
    public void aceitar(
            Visitor visitor
    ) {
        visitor.visitarHamburguer(this);
    }
}