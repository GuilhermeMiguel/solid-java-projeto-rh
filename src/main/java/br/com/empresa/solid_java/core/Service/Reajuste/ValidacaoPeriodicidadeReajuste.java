package br.com.empresa.solid_java.core.Service.Reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.empresa.solid_java.core.Interface.ValidacaoReajuste;
import br.com.empresa.solid_java.data.Exception.ValidacaoException;
import br.com.empresa.solid_java.data.Model.Funcionario;

public class ValidacaoPeriodicidadeReajuste implements ValidacaoReajuste {

	public void validar(Funcionario funcionario, BigDecimal aumento) {
		
		LocalDate dataUltimoReajuste = funcionario.getDataUltimoReajuste();
		LocalDate dataAtual = LocalDate.now();
		
		long mesesDesdeUltimoReajuste = ChronoUnit.MONTHS.between(dataUltimoReajuste, dataAtual);
		
		if (mesesDesdeUltimoReajuste < 6) {
			throw new ValidacaoException("Intervalo entre reajustes deve ser no minimo de 6 meses!");
		}		
	}

	
}
