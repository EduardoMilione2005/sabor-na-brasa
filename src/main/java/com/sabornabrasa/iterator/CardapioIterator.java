package com.sabornabrasa.iterator;

import java.util.ArrayList;
import java.util.List;

public class CardapioIterator {

    private List<String> itens;

    public CardapioIterator() {
        this.itens = new ArrayList<>();
    }

    public void adicionarItem(String item) {
        itens.add(item);
    }

    public IteratorCardapio criarIterator() {
        return new IteratorCardapio(itens);
    }
}