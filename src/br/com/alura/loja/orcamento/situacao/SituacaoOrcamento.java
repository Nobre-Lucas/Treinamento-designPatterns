package br.com.alura.loja.orcamento.situacao;

import java.math.BigDecimal;

import br.com.alura.loja.DomainException;
import br.com.alura.loja.orcamento.Orcamento;

public abstract class SituacaoOrcamento {

	public BigDecimal calculaValorDescontoExtra(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

	public void aprova(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser aprovado");
	}

	public void reprova(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser reprovado");
	}

	public void finaliza(Orcamento orcamento) {
		throw new DomainException("Orçamento não pode ser finalizado");
	}

}
