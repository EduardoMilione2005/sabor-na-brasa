package com.sabornabrasa.iterator;

import java.util.List;

public class IteratorCardapio {

    private List<String> itens;
    private int posicao = 0;

    public IteratorCardapio(List<String> itens) {
        this.itens = itens;
    }

    public boolean hasNext() {
        return posicao < itens.size();
    }

    public String next() {
        if (hasNext()) {
            return itens.get(posicao++);
        }
        return null;
    }
}