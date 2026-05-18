package com.sabornabrasa.visitor;

public class VisitorPreco
        implements Visitor {

    @Override
    public void visitarHamburguer(
            HamburguerItem hamburguer
    ) {

        System.out.println(
                "Hambúrguer: "
                        + hamburguer.getNome()
                        + " - R$ "
                        + hamburguer.getPreco()
        );
    }

    @Override
    public void visitarBebida(
            BebidaItem bebida
    ) {

        System.out.println(
                "Bebida: "
                        + bebida.getNome()
                        + " - R$ "
                        + bebida.getPreco()
        );
    }

    @Override
    public void visitar(ProdutoVisitor produtoVisitor) {

    }
}