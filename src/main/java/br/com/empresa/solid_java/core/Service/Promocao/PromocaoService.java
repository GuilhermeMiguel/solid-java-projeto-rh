package br.com.empresa.solid_java.core.Service.Promocao;

import br.com.empresa.solid_java.data.Exception.ValidacaoException;
import br.com.empresa.solid_java.data.Model.Cargo;
import br.com.empresa.solid_java.data.Model.Funcionario;

public class PromocaoService {

	public void promoverFuncionario(Funcionario funcionario, boolean metaBatida) {
		Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
		if(Cargo.GERENTE == cargoAtual)
			throw new ValidacaoException("Gerentes não podem ser promovidos!");
		
		if(metaBatida) {
			Cargo novoCargo = cargoAtual.getProximoCargo();
			funcionario.promover(novoCargo);
		} else {
			throw new ValidacaoException("Funcionario não bateu a meta!");
		}
	}
}
