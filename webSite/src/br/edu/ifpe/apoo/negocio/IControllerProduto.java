package br.edu.ifpe.apoo.negocio;

import java.util.List;

import br.edu.ifpe.apoo.entidade.Produto;
import br.edu.ifpe.apoo.excecoes.ExcecaoNegocio;

public interface IControllerProduto{
	
	void inserir(Produto produto) throws ExcecaoNegocio, Exception;
	List<Produto> listarTodos() throws ExcecaoNegocio, Exception;

}
