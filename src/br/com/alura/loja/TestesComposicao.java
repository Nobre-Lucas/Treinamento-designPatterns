package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesComposicao {

	public static void main(String[] args) {
		Orcamento antigo = new Orcamento();
		antigo.adicionaItem(new ItemOrcamento(new BigDecimal("200")));
		antigo.reprovaOrcamento();

		Orcamento novo = new Orcamento();
		novo.adicionaItem(new ItemOrcamento(new BigDecimal("500")));
		novo.adicionaItem(antigo);

		System.out.println(novo.getValor());
	}

}
