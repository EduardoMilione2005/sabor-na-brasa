package com.sabornabrasa.strategy;

public class DescontoClienteVip
        implements DescontoStrategy {

    @Override
    public double aplicarDesconto(
            double valor
    ) {

        return valor * 0.85;
    }
}