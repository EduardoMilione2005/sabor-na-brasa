package com.sabornabrasa;

import com.sabornabrasa.adapter.Entrega;
import com.sabornabrasa.adapter.EntregaAdapter;
import com.sabornabrasa.adapter.SistemaEntregaAntigo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AdapterTest {

    @Test
    void deveAdaptarSistemaDeEntrega() {

        SistemaEntregaAntigo sistema =
                new SistemaEntregaAntigo();

        Entrega adapter =
                new EntregaAdapter(
                        sistema
                );

        assertNotNull(
                adapter
        );

        assertDoesNotThrow(
                adapter::realizarEntrega
        );
    }
}