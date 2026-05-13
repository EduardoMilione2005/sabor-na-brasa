package com.sabornabrasa.templatemethod;

public abstract class PrepararPedido {

    public final void preparar() {

        selecionarPao();
        adicionarIngredientes();
        finalizar();
    }

    protected abstract void selecionarPao();

    protected abstract void adicionarIngredientes();

    private void finalizar() {

        System.out.println(
                "Pedido finalizado!"
        );
    }
}