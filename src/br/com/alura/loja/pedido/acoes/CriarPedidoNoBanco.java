package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class CriarPedidoNoBanco implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando o pedido no banco de dados...");
    }
}
