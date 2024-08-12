package br.edu.ifpe.apoo.main;

import br.edu.ifpe.apoo.apresentacao.TelaAluno;
import br.edu.ifpe.apoo.execoes.ExecacaoNegocio;

public class Main {
	public static void main(String[] args) throws ExecacaoNegocio, ExecacaoNegocio.ExcecaoNegocio {
		new TelaAluno().exibir();

	}

}
