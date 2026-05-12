package com.sabornabrasa;

import com.sabornabrasa.singleton.ConfiguracaoSistema;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingletonTest {

    @Test
    void deveRetornarMesmaInstancia() {

        ConfiguracaoSistema config1 =
                ConfiguracaoSistema
                        .getInstancia();

        ConfiguracaoSistema config2 =
                ConfiguracaoSistema
                        .getInstancia();

        assertSame(config1, config2);
    }
}