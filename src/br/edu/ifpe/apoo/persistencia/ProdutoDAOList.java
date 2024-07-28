package br.edu.ifpe.apoo.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpe.apoo.entidade.Produto;

public class ProdutoDAOList implements IProdutoDAO {
	private List<Produto> lista;
	
	private static ProdutoDAOList instancia;
	
	private ProdutoDAOList() {
		this.lista = new ArrayList<>();
	}
	public static ProdutoDAOList getInstancia() {
		if (instancia == null) {
			instancia = new ProdutoDAOList();
		}
		return instancia;
	}
	public void inserir(Produto produto) {
		this.lista.add(produto);
	}
	public List<Produto> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

}
