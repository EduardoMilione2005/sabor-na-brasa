package com.sabornabrasa;

import com.sabornabrasa.abstractfactory.*;
import com.sabornabrasa.bridge.IngredienteTradicional;
import com.sabornabrasa.bridge.IngredienteVegano;
import com.sabornabrasa.chain.Atendente;
import com.sabornabrasa.chain.Dono;
import com.sabornabrasa.chain.Gerente;
import com.sabornabrasa.decorator.BaconDecorator;
import com.sabornabrasa.decorator.HamburguerBase;
import com.sabornabrasa.decorator.HamburguerSimples;
import com.sabornabrasa.decorator.QueijoExtraDecorator;
import com.sabornabrasa.director.HamburguerDirector;
import com.sabornabrasa.model.Hamburguer;
import com.sabornabrasa.refinedabstraction.HamburguerPremium;

public class Main {

    public static void main(String[] args) {

        // ===== BUILDER =====

        HamburguerDirector director = new HamburguerDirector();

        Hamburguer tradicional =
                director.criarHamburguerTradicional();

        Hamburguer vegano =
                director.criarHamburguerVegano();

        System.out.println(
                "=== HAMBÚRGUER TRADICIONAL ==="
        );

        System.out.println(tradicional);

        System.out.println(
                "\n=== HAMBÚRGUER VEGANO ==="
        );

        System.out.println(vegano);

        // ===== BRIDGE =====

        System.out.println(
                "\n=== HAMBÚRGUER PREMIUM ==="
        );

        HamburguerPremium premiumTradicional =
                new HamburguerPremium(
                        new IngredienteTradicional()
                );

        premiumTradicional.montar();

        System.out.println();

        HamburguerPremium premiumVegano =
                new HamburguerPremium(
                        new IngredienteVegano()
                );

        premiumVegano.montar();

        // ===== ABSTRACT FACTORY =====

        System.out.println(
                "\n=== ABSTRACT FACTORY ==="
        );

        HamburguerFactory factoryTradicional =
                new FactoryTradicional();

        Bebida bebidaTradicional =
                factoryTradicional.criarBebida();

        Batata batataTradicional =
                factoryTradicional.criarBatata();

        bebidaTradicional.exibirTipo();
        batataTradicional.exibirTipo();

        System.out.println();

        HamburguerFactory factoryVegana =
                new FactoryVegana();

        Bebida bebidaVegana =
                factoryVegana.criarBebida();

        Batata batataVegana =
                factoryVegana.criarBatata();

        bebidaVegana.exibirTipo();
        batataVegana.exibirTipo();

        // ===== CHAIN OF RESPONSIBILITY =====

        System.out.println(
                "\n=== CHAIN OF RESPONSIBILITY ==="
        );

        Atendente atendente = new Atendente();
        Gerente gerente = new Gerente();
        Dono dono = new Dono();

        atendente.setProximo(gerente);
        gerente.setProximo(dono);

        atendente.atender("pedido");
        atendente.atender("reclamacao");
        atendente.atender("grave");

        // ===== DECORATOR =====

        System.out.println(
                "\n=== DECORATOR ==="
        );

        HamburguerBase hamburguer =
                new HamburguerSimples();

        hamburguer =
                new BaconDecorator(hamburguer);

        hamburguer =
                new QueijoExtraDecorator(
                        hamburguer
                );

        System.out.println(
                hamburguer.montar()
        );
    }
}