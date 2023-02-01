package br.com.alura.loja;

import br.com.alura.loja.pedido.GeraPedido;
import br.com.alura.loja.pedido.GeraPedidoHandler;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.LogDePedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBanco;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente = "Pedro";
        BigDecimal valorOrcamento = new BigDecimal("600");
        int quantidadeItens = Integer.parseInt("15");

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
        EnviarEmailPedido email = new EnviarEmailPedido();
        SalvarPedidoNoBanco salvar = new SalvarPedidoNoBanco();
        LogDePedido log = new LogDePedido();
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(email, salvar, log));
        handler.execute(gerador);
    }
}
