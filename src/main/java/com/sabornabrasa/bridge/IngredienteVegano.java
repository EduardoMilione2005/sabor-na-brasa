package com.sabornabrasa.bridge;

public class IngredienteVegano implements Ingrediente {

    @Override
    public void adicionarIngredientes() {

        System.out.println(
                "Pão integral, hambúrguer vegetal e alface"
        );
    }
}