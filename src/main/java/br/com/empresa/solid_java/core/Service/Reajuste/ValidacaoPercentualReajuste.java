package br.com.empresa.solid_java.core.Service.Reajuste;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.empresa.solid_java.core.Interface.ValidacaoReajuste;
import br.com.empresa.solid_java.data.Exception.ValidacaoException;
import br.com.empresa.solid_java.data.Model.Funcionario;

public class ValidacaoPercentualReajuste implements ValidacaoReajuste {

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		BigDecimal salarioAtual = funcionario.getDadosPessoais().getSalario();
		BigDecimal percentualReajuste = aumento.divide(salarioAtual, RoundingMode.HALF_UP);
		if (percentualReajuste.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidacaoException("Reajuste nao pode ser superior a 40% do salario!");
		}		
	}

	
}
