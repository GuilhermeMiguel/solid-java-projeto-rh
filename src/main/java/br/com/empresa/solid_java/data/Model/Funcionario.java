package br.com.empresa.solid_java.data.Model;

import java.math.BigDecimal;
import java.time.LocalDate;



public class Funcionario {

	private DadosPessoais dadosPessoais;
	private LocalDate dataUltimoReajuste;

	public Funcionario(String nome, String cpf, Cargo cargo, BigDecimal salario) {
		dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
	}

	
	/*
			Para se ter maior coesao numa classe, é interessante aplicar o principio
		Single Responsibility Principle
	
		O metodo reajustarSalario não faz muito senido na classe Funcionario -- vamos realocá-lo
		
		
	public void reajustarSalario(BigDecimal aumento) {
		BigDecimal percentualReajuste = aumento.divide(salario, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}
		this.salario = this.salario.add(aumento);
		this.dataUltimoReajuste = LocalDate.now();
	}
	
	*/

	
	

	public LocalDate getDataUltimoReajuste() {
		return dataUltimoReajuste;
	}

	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}


	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}


	public void setDataUltimoReajuste(LocalDate dataUltimoReajuste) {
		this.dataUltimoReajuste = dataUltimoReajuste;
	}


	public void atualizaSalario(BigDecimal salarioReajustado) {
		this.dadosPessoais.setSalario(salarioReajustado);  
		this.dataUltimoReajuste = LocalDate.now();
	}


	public void promover(Cargo novoCargo) {
		this.dadosPessoais.setCargo(novoCargo);  
	}

}
