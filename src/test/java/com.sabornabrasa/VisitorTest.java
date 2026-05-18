package com.sabornabrasa;

import com.sabornabrasa.visitor.ProdutoVisitor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VisitorTest {

    @Test
    void deveRetornarPrecoProduto() {

        ProdutoVisitor produto =
                new ProdutoVisitor(
                        "Hambúrguer",
                        30.0
                );

        assertEquals(
                30.0,
                produto.getPreco()
        );
    }
}