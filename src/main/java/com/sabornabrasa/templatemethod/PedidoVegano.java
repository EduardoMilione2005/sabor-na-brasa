package com.sabornabrasa.templatemethod;

public class PedidoVegano
        extends PrepararPedido {

    @Override
    protected void selecionarPao() {

        System.out.println(
                "Pão vegano selecionado"
        );
    }

    @Override
    protected void adicionarIngredientes() {

        System.out.println(
                "Hambúrguer vegetal adicionado"
        );
    }
}