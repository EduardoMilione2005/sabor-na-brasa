package com.sabornabrasa.templatemethod;

public class PedidoTradicional
        extends PrepararPedido {

    @Override
    protected void selecionarPao() {

        System.out.println(
                "Pão tradicional selecionado"
        );
    }

    @Override
    protected void adicionarIngredientes() {

        System.out.println(
                "Carne e queijo adicionados"
        );
    }
}