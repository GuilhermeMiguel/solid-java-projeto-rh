package br.com.empresa.solid_java.core.Service;

import java.math.BigDecimal;
import java.util.List;

import br.com.empresa.solid_java.core.Interface.ValidacaoReajuste;
import br.com.empresa.solid_java.data.Model.Funcionario;

public class ReajusteService {

	
	/*
	 	 
	 	 Essa classe é muito mais estavel, pois ela depende somente de interfaces
	 	 
	 	  
	*/
	
	
	
	
	//Um List com as interfaces
	private List<ValidacaoReajuste> validacoes;
	
	public ReajusteService(List<ValidacaoReajuste> validacoes) {
		this.validacoes = validacoes;
	}


	public void reajustarSalarioDoFuncionario(Funcionario funcionario, BigDecimal aumento) {
		
		/*
		  	
		  	Eu chamo as validações por meio da interface, a minha classe nem precisa conhecer as implementações do metodos 
		  	
		  	
		  		Essa extração de dados para as interfaces representa o OPEN CLOSED PRINCIPLE
		  	
		  		Não é necessário fazer grandes alterações numa classe para adicionar uma  funcionalidade -- não é correto
		  	
		  	é melhor utilizar o conceito de interfaces com polimorfismo, 
		  	
		  	o ideal é que para implementar novos códigos não se mexa em código já existentes
		  	
		  	
		  	
		  		Não depender de classes concretas é uma coisa muito boa, pois elas são mais instáveis, ou seja, podem mudar constantemente 
		  	
		  	Já interfaces são mais estaveis, ou seja, não mudam tanto 
		  	
		  	
		  	Dessa forma diminuimos o acoplamento, pois estamos dependendo menos das classes -- estamos acoplando a interface 
		  	
		  	
		*/
		
		this.validacoes.forEach(x-> x.validar(funcionario, aumento));
		
		BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizaSalario(salarioReajustado);
	}
}
