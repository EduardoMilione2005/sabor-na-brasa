package com.sabornabrasa.singleton;

public class ConfiguracaoSistema {

    private static ConfiguracaoSistema instancia;

    private final String nomeHamburgueria;

    private ConfiguracaoSistema() {

        nomeHamburgueria =
                "Sabor na Brasa";
    }

    public static ConfiguracaoSistema
    getInstancia() {

        if (instancia == null) {

            instancia =
                    new ConfiguracaoSistema();
        }

        return instancia;
    }

    public String getNomeHamburgueria() {

        return nomeHamburgueria;
    }
}