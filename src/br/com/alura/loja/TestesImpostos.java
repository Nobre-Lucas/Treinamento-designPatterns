package br.com.alura.loja;

import java.math.BigDecimal;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.ICMS;
import br.com.alura.loja.imposto.ISS;
import br.com.alura.loja.orcamento.ItemOrcamento;
import br.com.alura.loja.orcamento.Orcamento;

public class TestesImpostos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento();
		orcamento.adicionaItem(new ItemOrcamento(new BigDecimal("100")));
		CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();
		System.out.println(calculadoraDeImpostos.calculaTotalDeImpostos(orcamento, new ICMS(null)));
		System.out.println(calculadoraDeImpostos.calculaTotalDeImpostos(orcamento, new ISS(null)));
		System.out.println(calculadoraDeImpostos.calculaTotalDeImpostos(orcamento, new ISS(new ICMS(null))));
	}

}
