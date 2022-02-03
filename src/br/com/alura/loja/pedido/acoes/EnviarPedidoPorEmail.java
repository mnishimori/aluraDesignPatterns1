package br.com.alura.loja.pedido.acoes;

import br.com.alura.loja.pedido.Pedido;

public class EnviarPedidoPorEmail implements AcaoAposGerarPedido {
    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email para o cliente sobre o pedido...");
    }
}
