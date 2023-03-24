package br.com.alura.loja.orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.alura.loja.orcamento.situacao.EmAnalise;
import br.com.alura.loja.orcamento.situacao.Finalizado;
import br.com.alura.loja.orcamento.situacao.SituacaoOrcamento;

public class Orcamento {

	private BigDecimal valor;
	private List<ItemOrcamento> itens;
	private SituacaoOrcamento situacaoOrcamento;

	public Orcamento() {
		this.valor = BigDecimal.ZERO;
		this.itens = new ArrayList<>();
		this.situacaoOrcamento = new EmAnalise();
	}

	public BigDecimal getValor() {
		return valor;
	}

	public int getQuantidadeItens() {
		return itens.size();
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

	public boolean isFinalizado() {
		return situacaoOrcamento instanceof Finalizado;
	}

	public void adicionaItem(ItemOrcamento itemOrcamento) {
		this.valor = valor.add(itemOrcamento.getValor());
		this.itens.add(itemOrcamento);
	}

}
