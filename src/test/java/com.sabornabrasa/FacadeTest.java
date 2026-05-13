package com.sabornabrasa;

import com.sabornabrasa.facade.HamburgueriaFacade;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FacadeTest {

    @Test
    void deveCriarFacade() {

        HamburgueriaFacade facade =
                new HamburgueriaFacade();

        assertNotNull(facade);
    }
}