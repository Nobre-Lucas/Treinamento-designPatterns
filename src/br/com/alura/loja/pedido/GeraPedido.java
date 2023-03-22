package br.com.alura.loja.pedido;

import java.math.BigDecimal;

public class GeraPedido {

	private String nomeCliente;
	private BigDecimal valorOrcamento;
	private int quantidadeItens;

	public GeraPedido(String nomeCliente, BigDecimal valorOrcamento, int quantidadeItens) {
		this.nomeCliente = nomeCliente;
		this.valorOrcamento = valorOrcamento;
		this.quantidadeItens = quantidadeItens;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public BigDecimal getValorOrcamento() {
		return valorOrcamento;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

}
