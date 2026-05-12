package com.sabornabrasa.chain;

public class Atendente extends Atendimento {

    @Override
    public void atender(String problema) {

        if (problema.equalsIgnoreCase("pedido")) {

            System.out.println(
                    "Atendente resolveu o pedido."
            );

        } else if (proximo != null) {

            proximo.atender(problema);
        }
    }
}