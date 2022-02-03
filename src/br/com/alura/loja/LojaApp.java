package br.com.alura.loja;

import br.com.alura.loja.desconto.CalculadoraDeDesconto;
import br.com.alura.loja.imposto.CalculadoraDeImposto;
import br.com.alura.loja.imposto.Icms;
import br.com.alura.loja.imposto.Iss;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class LojaApp {

    public static void main(String[] args) {
        /*STRATEGY*/
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));

        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

        System.out.println("Valor ICMS " + calculadora.calcular(orcamento, new Icms(null)));
        System.out.println("Valor ISS " + calculadora.calcular(orcamento, new Iss(null)));



        /* CHAIN OF RESPONSIBILITY, TEMPLATE METHOD, STATE */
        Orcamento primeiroOrcamento = new Orcamento();
        primeiroOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("200")));
        Orcamento segundoOrcamento = new Orcamento();
        segundoOrcamento.adicionarItem(new ItemOrcamento(new BigDecimal("1000")));

        CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();

        System.out.println(calculadoraDeDesconto.calcular(primeiroOrcamento));
        System.out.println(calculadoraDeDesconto.calcular(segundoOrcamento));

    }
}
