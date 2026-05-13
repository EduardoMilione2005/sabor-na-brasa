package com.sabornabrasa.facade;

public class HamburgueriaFacade {

    private final CozinhaService cozinha =
            new CozinhaService();

    private final PagamentoService pagamento =
            new PagamentoService();

    private final EntregaService entrega =
            new EntregaService();

    public void realizarPedido() {

        cozinha.prepararPedido();

        pagamento.realizarPagamento();

        entrega.enviarPedido();
    }
}