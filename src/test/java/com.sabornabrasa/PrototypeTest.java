package com.sabornabrasa;

import com.sabornabrasa.prototype.Hamburguer;
import com.sabornabrasa.prototype.HamburguerPrototype;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PrototypeTest {

    @Test
    void deveClonarHamburguer() {

        HamburguerPrototype original =
                new Hamburguer(
                        "X-Burger",
                        30.0
                );

        HamburguerPrototype clone =
                original.clone();

        assertNotSame(original, clone);

        assertEquals(
                original.getNome(),
                clone.getNome()
        );

        assertEquals(
                original.getPreco(),
                clone.getPreco()
        );
    }
}