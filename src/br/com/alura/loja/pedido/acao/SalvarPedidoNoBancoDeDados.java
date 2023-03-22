package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados implements AcaoAposGerarPedido {

	public void executaAcao(Pedido pedido) {
		System.out.println("Salvar pedido no Banco de Dados: " + pedido);
	}

}
