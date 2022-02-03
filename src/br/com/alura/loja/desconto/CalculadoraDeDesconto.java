package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/*
Aplicação do design pattern Chain of Responsibility
 */
public class CalculadoraDeDesconto {

    public BigDecimal calcular(Orcamento orcamento) {
        return new DescontoParaOrcamentoComMaisDeCincoItens(
                    new DescontoParaOrcamentoComValorMaiorDoQueQuinhentos(
                        new SemDesconto(null)))
                .calcular(orcamento);
    }

}
