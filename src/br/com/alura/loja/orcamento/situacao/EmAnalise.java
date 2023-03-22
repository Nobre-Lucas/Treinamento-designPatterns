package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class EmAnalise extends SituacaoOrcamento {

	public BigDecimal calculaValorDescontoExtra(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.05"));
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.setSituacao(new Aprovado());
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.setSituacao(new Reprovado());
	}

}
