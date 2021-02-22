package br.com.empresa.solid_java.core.Service.Tributacao;

import java.math.BigDecimal;

public interface IReajusteTributavel extends IReajusteNaoTributavel {

	/*
	  	
	  		Eu quero que essa interface tenha os metodos da nao tributavel + o metodo com o 
	  	calculo do tributo que eu não quero que esteja presente na outra
	  	
	*/
	
	BigDecimal valorImpostoDeRenda();
	
}
