package br.com.alura.loja.desconto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

/*
Aplicação do design pattern Template Method
 */
public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    protected BigDecimal calcular(Orcamento orcamento) {

        if (this.aplicarDesconto(orcamento)) {

            return this.efetuarCalculo(orcamento);
        }

        return proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected abstract boolean aplicarDesconto(Orcamento orcamento);

}
