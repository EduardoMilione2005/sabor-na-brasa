package com.sabornabrasa.chain;

public class Gerente extends Atendimento {

    @Override
    public void atender(String problema) {

        if (problema.equalsIgnoreCase("reclamacao")) {

            System.out.println(
                    "Gerente resolveu a reclamação."
            );

        } else if (proximo != null) {

            proximo.atender(problema);
        }
    }
}