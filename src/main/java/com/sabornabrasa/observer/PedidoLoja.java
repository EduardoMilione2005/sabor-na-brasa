package com.sabornabrasa.observer;

import java.util.ArrayList;
import java.util.List;

public class PedidoLoja
        implements PedidoObservable {

    private final List<ObservadorPedido>
            observadores =
            new ArrayList<>();

    private String status;

    @Override
    public void adicionarObservador(
            ObservadorPedido observador
    ) {

        observadores.add(observador);
    }

    @Override
    public void removerObservador(
            ObservadorPedido observador
    ) {

        observadores.remove(observador);
    }

    @Override
    public void notificarObservadores() {

        for (ObservadorPedido o
                : observadores) {

            o.atualizar(status);
        }
    }

    public void setStatus(
            String status
    ) {

        this.status = status;

        notificarObservadores();
    }
}