package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void execute(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido.");
    }

}
