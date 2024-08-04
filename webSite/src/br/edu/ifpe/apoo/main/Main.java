package br.edu.ifpe.apoo.main;

import br.edu.ifpe.apoo.apresentação.TelaProduto;
import br.edu.ifpe.apoo.excecoes.ExcecaoNegocio;

public class Main {

	public static void main(String[] args) throws ExcecaoNegocio {
		TelaProduto telaProduto =  new TelaProduto();
		
		try {
			telaProduto.exibir();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}