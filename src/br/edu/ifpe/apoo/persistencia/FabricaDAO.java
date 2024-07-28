package br.edu.ifpe.apoo.persistencia;

import br.edu.ifpe.apoo.persistencia.IProdutoDAO;
import br.edu.ifpe.apoo.persistencia.ProdutoDAOList;

@SuppressWarnings("unused")
public class FabricaDAO {
	public static IProdutoDAO getProdutoDAO() {
		return (IProdutoDAO) ProdutoDAOList.getInstancia();
	}

}


