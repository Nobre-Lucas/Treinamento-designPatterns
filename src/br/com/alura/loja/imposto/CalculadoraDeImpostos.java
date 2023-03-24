package br.com.alura.loja.imposto;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.Orcamento;

public class CalculadoraDeImpostos {

	// Implements the Decorator Pattern
	public BigDecimal calculaTotalDeImpostos(Orcamento orcamento, Imposto imposto) {
		return imposto.calcula(orcamento);
	}

}
