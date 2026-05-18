package com.sabornabrasa.memento;

public class PedidoMemento {

    private String estado;

    public void setEstado(String estado) {

        this.estado = estado;
    }

    public String getEstado() {

        return estado;
    }

    public PedidoSalvo salvar() {

        return new PedidoSalvo(
                estado
        );
    }

    public void restaurar(
            PedidoSalvo pedidoSalvo
    ) {

        estado =
                pedidoSalvo.getEstado();
    }
}