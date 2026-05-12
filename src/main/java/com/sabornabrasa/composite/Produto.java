package com.sabornabrasa.composite;

public class Produto implements ItemPedido {

    private final String nome;

    public Produto(String nome) {

        this.nome = nome;
    }

    @Override
    public void exibir() {

        System.out.println(
                "Produto: " + nome
        );
    }
}