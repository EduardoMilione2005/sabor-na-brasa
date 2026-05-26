package com.sabornabrasa.visitor;

public class CalculadoraPrecoVisitor implements Visitor {

    @Override
    public void visitarHamburguer(
            HamburguerItem hamburguer
    ) {

        System.out.println(
                "Preço do hambúrguer: R$ "
                        + hamburguer.getPreco()
        );
    }

    @Override
    public void visitarBebida(
            BebidaItem bebida
    ) {

        System.out.println(
                "Preço da bebida: R$ "
                        + bebida.getPreco()
        );
    }
}