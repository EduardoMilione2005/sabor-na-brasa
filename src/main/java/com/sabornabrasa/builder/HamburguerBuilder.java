package com.sabornabrasa.builder;

public class HamburguerBuilder {

    private final Hamburguer hamburguer;

    public HamburguerBuilder() {
        hamburguer = new Hamburguer();
    }

    public HamburguerBuilder adicionarPao(String pao) {
        hamburguer.setPao(pao);
        return this;
    }

    public HamburguerBuilder adicionarCarne(String carne) {
        hamburguer.setCarne(carne);
        return this;
    }

    public HamburguerBuilder adicionarQueijo(String queijo) {
        hamburguer.setQueijo(queijo);
        return this;
    }

    public HamburguerBuilder adicionarBacon(boolean bacon) {
        hamburguer.setBacon(bacon);
        return this;
    }

    public HamburguerBuilder adicionarSalada(boolean salada) {
        hamburguer.setSalada(salada);
        return this;
    }

    public HamburguerBuilder adicionarMolho(String molho) {
        hamburguer.setMolho(molho);
        return this;
    }

    public Hamburguer build() {
        return hamburguer;
    }
}