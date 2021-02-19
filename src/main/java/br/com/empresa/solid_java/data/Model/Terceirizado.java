package br.com.empresa.solid_java.data.Model;

import java.math.BigDecimal;

public class Terceirizado {
	
	private DadosPessoais dadosPessoais;
	private String empresa;
	
	
	public Terceirizado(String nome, String cpf, Cargo cargo, BigDecimal salario, String empresa) {
		dadosPessoais = new DadosPessoais(nome, cpf, cargo, salario);
		this.empresa = empresa;
	}


	/*
	 	Liskov Substitution Principle 
	 	
	 	Em situações que eu possa extender uma classe mas acontece de a classe Filha não ser exatamente do tipo da classe pai, é melhor utilizar Composição 
	 	
	 	Por exemplo, Terceirizado é um funcionario, porém, no nosso sitema não é necessário se preocupar com informações como reajuste de salario, por exemplo.
	 	
	 	
	 	Favorecer a composição ---> private DadosPessoais dadosPessoais;
	 	
	 	
	*/
	
	public DadosPessoais getDadosPessoais() {
		return dadosPessoais;
	}


	public void setDadosPessoais(DadosPessoais dadosPessoais) {
		this.dadosPessoais = dadosPessoais;
	}


	public String getEmpresa() {
		return empresa;
	}


	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
	
}
