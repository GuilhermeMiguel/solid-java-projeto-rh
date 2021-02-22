package br.com.empresa.solid_java.core.Service.Tributacao;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Bienal implements IReajusteTributavel{

	private BigDecimal valor;
	private LocalDate data;
	
	@Override
	public BigDecimal valor() {
		return valor;
	}

	@Override
	public LocalDate data() {
		return data;
	}

	@Override
	public BigDecimal valorImpostoDeRenda() {
		return valor.multiply(new BigDecimal("0.1"));
	}

}
