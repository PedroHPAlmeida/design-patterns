package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {
    @Override
    public void execute(Pedido pedido) {
        System.out.println("Pedido foi gerado: " + pedido);
    }
}
