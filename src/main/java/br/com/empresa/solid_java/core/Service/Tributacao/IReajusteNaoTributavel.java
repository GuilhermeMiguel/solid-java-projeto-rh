package br.com.empresa.solid_java.core.Service.Tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface IReajusteNaoTributavel {

	BigDecimal valor();
	LocalDate data();
}
