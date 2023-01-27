package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

public class Reprovado extends Situacao {

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}
