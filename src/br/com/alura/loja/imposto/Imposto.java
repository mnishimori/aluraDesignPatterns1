package br.com.alura.loja.imposto;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Imposto {

    private Imposto outroImposto;

    public Imposto(Imposto outroImposto) {
        this.outroImposto = outroImposto;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = this.realizarCalculo(orcamento);

        BigDecimal valorOutroImposto = BigDecimal.ZERO;
        if (this.outroImposto != null) {
            valorOutroImposto = this.outroImposto.realizarCalculo(orcamento);
        }

        return valorImposto.add(valorOutroImposto);
    }

}
