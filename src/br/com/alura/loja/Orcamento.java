package br.com.alura.loja;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeIntes;

    public Orcamento(BigDecimal valor, int quantidadeIntes) {
        this.valor = valor;
        this.quantidadeIntes = quantidadeIntes;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeIntes() {
        return quantidadeIntes;
    }

}
