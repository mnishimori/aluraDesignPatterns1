package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acoes.AcaoAposGerarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoesAposGerarPedido;

    // injecao de dependencias para servicos de infra
    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoesAposGerarPedido) {
        this.acoesAposGerarPedido = acoesAposGerarPedido;
    }

    public void executar(GeraPedido geraPedido) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        Pedido pedido = new Pedido(geraPedido.getCliente(), LocalDateTime.now(), orcamento);

        // utilizacao dos servicos de infra
        this.acoesAposGerarPedido.forEach(a -> a.executarAcao(pedido));
    }
}
