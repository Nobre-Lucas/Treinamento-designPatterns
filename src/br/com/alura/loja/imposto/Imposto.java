package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public abstract class Imposto {

	private Imposto outroImposto;

	public Imposto(Imposto outroImposto) {
		this.outroImposto = outroImposto;
	}

	protected abstract BigDecimal realizaCalculo(Orcamento orcamento);

	BigDecimal calcula(Orcamento orcamento) {
		BigDecimal valorImposto = realizaCalculo(orcamento);
		BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
		if (outroImposto != null) {
			valorDoOutroImposto = outroImposto.realizaCalculo(orcamento);
		}
		return valorImposto.add(valorDoOutroImposto);
	};

}
