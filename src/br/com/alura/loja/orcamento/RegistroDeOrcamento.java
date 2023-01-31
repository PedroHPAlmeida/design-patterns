package br.com.alura.loja.orcamento;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.http.HttpAdapter;

import java.util.Map;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registar(Orcamento orcamento) {
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado.");
        }
        Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQuantidadeIntes()
        );
        http.post("http:://api.external/orcamento", dados);
    }

}
