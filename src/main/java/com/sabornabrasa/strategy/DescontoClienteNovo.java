package com.sabornabrasa.strategy;

public class DescontoClienteNovo
        implements DescontoStrategy {

    @Override
    public double aplicarDesconto(
            double valor
    ) {

        return valor * 0.95;
    }
}