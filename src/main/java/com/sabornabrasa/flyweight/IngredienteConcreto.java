package com.sabornabrasa.flyweight;

public class IngredienteConcreto
        implements IngredienteFlyweight {

    private final String tipo;

    public IngredienteConcreto(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public void exibir(String nomePedido) {

        System.out.println(
                "Pedido: " + nomePedido +
                        " | Ingrediente: " + tipo
        );
    }
}