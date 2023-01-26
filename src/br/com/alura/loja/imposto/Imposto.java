package br.com.alura.loja.imposto;

import br.com.alura.loja.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}
