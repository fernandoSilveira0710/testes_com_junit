package br.com.alura.tdd.service;

import java.math.BigDecimal;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

public class ReajusteService {

	public void concederReajuste(Funcionario funcionario, Desempenho desempenho) {
			BigDecimal percentual = desempenho.percentualReajuste();
			BigDecimal reajusteBigDecimal = funcionario.getSalario().multiply(percentual);
			funcionario.reajusteSalario(reajusteBigDecimal);		
	}

}
