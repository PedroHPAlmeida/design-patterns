package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBanco implements  AcaoAposGerarPedido {

    public void execute(Pedido pedido) {
        System.out.println("Salvando pedido no banco de dados.");
    }

}
