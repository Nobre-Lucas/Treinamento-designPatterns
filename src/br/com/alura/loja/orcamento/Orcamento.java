package br.com.alura.loja.orcamento;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private int quantidadeItens;
	private SituacaoOrcamento situacaoOrcamento;

	public Orcamento(BigDecimal valor, int quantidadeItens) {
		this.valor = valor;
		this.quantidadeItens = quantidadeItens;
		this.situacaoOrcamento = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void aplicaDescontoExtra() {
		BigDecimal valorDoDescontoExtra = this.situacaoOrcamento.calculaValorDescontoExtra(this);
		this.valor = this.valor.subtract(valorDoDescontoExtra);
	}

	public void aprovaOrcamento() {
		this.situacaoOrcamento.aprova(this);
	}

	public void reprovaOrcamento() {
		this.situacaoOrcamento.reprova(this);
	}

	public void finalizaOrcamento() {
		this.situacaoOrcamento.finaliza(this);
	}

	public SituacaoOrcamento getSituacaoOrcamento() {
		return situacaoOrcamento;
	}

	public void setSituacao(SituacaoOrcamento situacaoOrcamento) {
		this.situacaoOrcamento = situacaoOrcamento;
	}

}
