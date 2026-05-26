package com.sabornabrasa;

import com.sabornabrasa.visitor.HamburguerItem;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorTest {

    @Test
    void deveRetornarPrecoProduto() {

        HamburguerItem produto =
                new HamburguerItem(
                        "Hambúrguer",
                        30.0
                );

        assertEquals(
                30.0,
                produto.getPreco()
        );
    }
}