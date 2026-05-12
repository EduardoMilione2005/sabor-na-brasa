package com.sabornabrasa.observer;

public class Cliente
        implements ObservadorPedido {

    private final String nome;

    public Cliente(String nome) {

        this.nome = nome;
    }

    @Override
    public void atualizar(String status) {

        System.out.println(
                nome
                        + " recebeu atualização: "
                        + status
        );
    }
}