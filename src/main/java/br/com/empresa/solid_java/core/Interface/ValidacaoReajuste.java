package br.com.empresa.solid_java.core.Interface;

import java.math.BigDecimal;

import br.com.empresa.solid_java.data.Model.Funcionario;

public interface ValidacaoReajuste {

	//Em interfaces os metos são sempre publicos 
	void validar(Funcionario funcionario, BigDecimal aumento);
}
