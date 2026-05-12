package com.sabornabrasa.composite;

import java.util.ArrayList;
import java.util.List;

public class Combo implements ItemPedido {

    private final String nome;

    private final List<ItemPedido> itens =
            new ArrayList<>();

    public Combo(String nome) {

        this.nome = nome;
    }

    public void adicionar(ItemPedido item) {

        itens.add(item);
    }

    @Override
    public void exibir() {

        System.out.println(
                "Combo: " + nome
        );

        for (ItemPedido item : itens) {

            item.exibir();
        }
    }
}