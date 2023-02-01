package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.imposto.Imposto;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        Imposto icms = new ICMS(null);
        Imposto iss = new ISS(null);
        Imposto icmsEIss = new ICMS(iss);

        System.out.println(calculadora.calcular(orcamento, icms));
        System.out.println(calculadora.calcular(orcamento, iss));
        System.out.println(calculadora.calcular(orcamento, icmsEIss));
    }
}
