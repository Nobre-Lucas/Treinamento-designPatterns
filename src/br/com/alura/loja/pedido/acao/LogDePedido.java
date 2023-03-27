package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class LogDePedido implements AcaoAposGerarPedido {

	@Override
	public void executaAcao(Pedido pedido) {
		// To do: Implements log system
		System.out.println("Pedido foi gerado: " + pedido);

	}

}
