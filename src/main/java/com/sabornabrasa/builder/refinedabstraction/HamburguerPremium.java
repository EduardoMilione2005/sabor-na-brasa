package com.sabornabrasa.builder.refinedabstraction;

import com.sabornabrasa.bridge.Ingrediente;
import com.sabornabrasa.builder.model.Hamburguer;

public class HamburguerPremium extends Hamburguer {

    private Ingrediente ingrediente;

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