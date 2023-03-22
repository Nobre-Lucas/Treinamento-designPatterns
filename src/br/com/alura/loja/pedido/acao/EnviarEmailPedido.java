package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

	public void executaAcao(Pedido pedido) {
		System.out.println("Enviar email com dados do novo pedido: " + pedido.getCliente() + " " + pedido.getData()
				+ " " + pedido.getOrcamento());
	}

}
