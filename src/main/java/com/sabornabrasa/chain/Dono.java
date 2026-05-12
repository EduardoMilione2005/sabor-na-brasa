package com.sabornabrasa.chain;

public class Dono extends Atendimento {

    @Override
    public void atender(String problema) {

        if (problema.equalsIgnoreCase("grave")) {

            System.out.println(
                    "Dono resolveu o problema grave."
            );

        } else {

            System.out.println(
                    "Problema não identificado."
            );
        }
    }
}