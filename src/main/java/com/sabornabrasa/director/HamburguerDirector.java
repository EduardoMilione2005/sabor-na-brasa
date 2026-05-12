package com.sabornabrasa.director;

import com.sabornabrasa.builder.HamburguerBuilder;
import com.sabornabrasa.model.Hamburguer;

public class HamburguerDirector {

    public Hamburguer criarHamburguerTradicional() {
        return new HamburguerBuilder()
                .adicionarPao("Brioche")
                .adicionarCarne("Carne bovina 180g")
                .adicionarQueijo("Cheddar")
                .adicionarBacon(true)
                .adicionarSalada(true)
                .adicionarMolho("Barbecue")
                .build();
    }

    public Hamburguer criarHamburguerVegano() {
        return new HamburguerBuilder()
                .adicionarPao("Integral")
                .adicionarCarne("Hambúrguer vegetal")
                .adicionarQueijo("Vegano")
                .adicionarBacon(false)
                .adicionarSalada(true)
                .adicionarMolho("Mostarda e mel")
                .build();
    }
}