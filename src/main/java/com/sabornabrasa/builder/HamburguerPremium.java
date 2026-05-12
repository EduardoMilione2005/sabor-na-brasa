package com.sabornabrasa.builder;

import com.sabornabrasa.bridge.Ingrediente;

public class HamburguerPremium extends Hamburguer {

    private final Ingrediente ingrediente;

    public HamburguerPremium(Ingrediente ingrediente) {

        this.ingrediente = ingrediente;
    }

    public void montar() {

        System.out.println(
                "Montando hambúrguer premium:"
        );

        ingrediente.adicionarIngredientes();
    }
}