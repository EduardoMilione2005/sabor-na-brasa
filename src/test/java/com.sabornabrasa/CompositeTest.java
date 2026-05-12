package com.sabornabrasa;

import com.sabornabrasa.composite.Combo;
import com.sabornabrasa.composite.Produto;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CompositeTest {

    @Test
    void deveCriarComboComProdutos() {

        Produto hamburguer =
                new Produto("Hambúrguer");

        Produto batata =
                new Produto("Batata");

        Combo combo =
                new Combo("Combo Especial");

        combo.adicionar(hamburguer);
        combo.adicionar(batata);

        assertNotNull(combo);
    }
}