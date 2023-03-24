package br.com.alura.loja.pedido;

import java.time.LocalDateTime;
import java.util.List;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.AcaoAposGerarPedido;

public class GeraPedidoHandler {

	private List<AcaoAposGerarPedido> acoes;

	// Constructor with dependencies injection: repository, service, etc.
	public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
		this.acoes = acoes;
	}

	public void execute(GeraPedido dados) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new ItemOrcamento(dados.getValorOrcamento()));
		Pedido pedido = new Pedido(dados.getNomeCliente(), LocalDateTime.now(), orcamento);

		// To do: Add those features
		acoes.forEach(a -> a.executaAcao(pedido));
	}

}
