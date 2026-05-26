package com.sabornabrasa.iterator;

import java.util.List;

public class IteratorMenu {

    private List<ItemMenu> itens;
    private int posicao = 0;

    public IteratorMenu(List<ItemMenu> itens) {
        this.itens = itens;
    }

    public boolean hasNext() {
        return posicao < itens.size();
    }

    public ItemMenu next() {
        if (hasNext()) {
            return itens.get(posicao++);
        }
        return null;
    }
}