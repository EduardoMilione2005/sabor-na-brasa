package com.sabornabrasa.adapter;

public class EntregaAdapter
        implements Entrega {

    private final SistemaEntregaAntigo sistema;

    public EntregaAdapter(
            SistemaEntregaAntigo sistema
    ) {

        this.sistema = sistema;

    }

    @Override
    public void realizarEntrega() {

        sistema.entregarPedido();

    }
}