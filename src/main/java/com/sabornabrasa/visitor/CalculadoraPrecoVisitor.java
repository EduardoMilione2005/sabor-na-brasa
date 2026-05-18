package com.sabornabrasa.visitor;

public class CalculadoraPrecoVisitor
        implements Visitor {

    @Override
    public void visitarHamburguer(HamburguerItem hamburguer) {

    }

    @Override
    public void visitarBebida(BebidaItem bebida) {

    }

    @Override
    public void visitar(
            ProdutoVisitor produto
    ) {

        System.out.println(
                produto.getNome()
                        + " custa R$ "
                        + produto.getPreco()
        );
    }
}