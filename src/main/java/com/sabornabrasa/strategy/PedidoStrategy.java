package com.sabornabrasa.strategy;

public class PedidoStrategy {

    private DescontoStrategy strategy;

    public void setStrategy(
            DescontoStrategy strategy
    ) {

        this.strategy = strategy;
    }

    public double calcularValor(
            double valor
    ) {

        return strategy.aplicarDesconto(
                valor
        );
    }
}