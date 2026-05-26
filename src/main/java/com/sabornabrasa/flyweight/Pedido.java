package com.sabornabrasa.flyweight;

public class Pedido {

    private final String nome;
    private IngredienteFlyweight ingrediente;

    public Pedido(
            String nome,
            IngredienteFlyweight ingrediente
    ) {
        this.nome = nome;
        this.ingrediente = ingrediente;
    }

    public void servir() {

        ingrediente.exibir(nome);
    }
}