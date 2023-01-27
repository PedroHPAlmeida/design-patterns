package br.com.alura.loja.desconto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoOrcamentoMaisDeCincoItens(
                new DescontoOrcamentoValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }

}
