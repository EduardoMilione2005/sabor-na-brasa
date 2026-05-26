package com.sabornabrasa;

import com.sabornabrasa.iterator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IteratorTest {

    @Test
    void devePercorrerMenu() {

        Menu menu = new Menu();

        menu.adicionarItem(
                new ItemMenu("X-Burger")
        );

        menu.adicionarItem(
                new ItemMenu("Batata")
        );

        IteratorMenu iterator =
                menu.criarIterator();

        assertTrue(iterator.hasNext());

        assertEquals(
                "X-Burger",
                iterator.next().getNome()
        );

        assertEquals(
                "Batata",
                iterator.next().getNome()
        );

        assertFalse(iterator.hasNext());
    }
}