package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeIntes;
    private Situacao situacao;

    public Orcamento(BigDecimal valor, int quantidadeIntes) {
        this.valor = valor;
        this.quantidadeIntes = quantidadeIntes;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDescontoExtra = BigDecimal.ZERO;
        if (situacao.equals("EM ANALISE")) {
            valorDescontoExtra = new BigDecimal("0.05");
        } else if (situacao.equals("APROVADO")) {
            valorDescontoExtra = new BigDecimal("0.02");
        }
        this.valor = this.valor.subtract(valorDescontoExtra);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeIntes() {
        return quantidadeIntes;
    }

    public Situacao getSituacao() {
        return situacao;
    }

    public void setSituacao(Situacao situacao) {
        this.situacao = situacao;
    }

}
