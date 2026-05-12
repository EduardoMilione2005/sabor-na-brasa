package com.sabornabrasa.observer;

public interface PedidoObservable {

    void adicionarObservador(
            ObservadorPedido observador
    );

    void removerObservador(
            ObservadorPedido observador
    );

    void notificarObservadores();
}