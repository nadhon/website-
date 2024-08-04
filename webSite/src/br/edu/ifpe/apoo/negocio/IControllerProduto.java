package br.edu.ifpe.apoo.negocio;

import java.util.List;

import br.edu.ifpe.apoo.entidade.Produto;

public interface IControllerProduto {
	
	void inserir(Produto produto);

	List<Produto> listarTodos();

}
