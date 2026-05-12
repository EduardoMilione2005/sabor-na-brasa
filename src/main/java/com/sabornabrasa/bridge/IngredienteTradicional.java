package com.sabornabrasa.bridge;

public class IngredienteTradicional implements Ingrediente {

    @Override
    public void adicionarIngredientes() {

        System.out.println(
                "Pão brioche, carne bovina e cheddar"
        );
    }
}