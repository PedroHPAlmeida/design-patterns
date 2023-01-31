package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeIntes;
    private Situacao situacao;

    public Orcamento(BigDecimal valor, int quantidadeIntes) {
        this.valor = valor;
        this.quantidadeIntes = quantidadeIntes;
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        this.situacao.calcularValorDescontoExtra(this);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
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

    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }

}
