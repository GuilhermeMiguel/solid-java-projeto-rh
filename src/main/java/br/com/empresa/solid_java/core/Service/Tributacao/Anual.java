package br.com.empresa.solid_java.core.Service.Tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Anual implements IReajusteNaoTributavel {

	private BigDecimal valor;
	private LocalDate data;
	
	public Anual(BigDecimal valor, LocalDate data) {
		this.valor = valor;
		this.data = data;
	}

	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}


}
