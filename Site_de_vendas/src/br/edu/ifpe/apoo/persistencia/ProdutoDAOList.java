package br.edu.ifpe.apoo.persistencia;
import br.edu.ifpe.entidades.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDAOList  implements IProdutoDAO{
	private final List<Produto> lista;

	private static ProdutoDAOList instancia;
	private ProdutoDAOList(){
		this.lista = new ArrayList<>();
	}
	public static ProdutoDAOList getInstancia(){
		if(instancia == null){
			instancia = new ProdutoDAOList() ;
		}
        return instancia;
    }

	@Override
	public void inserir(Produto produto) {
		this.lista.add(produto) ;
	}

	@Override
	public List<Produto> listarTodos() {
		return List.of();
	}

	@Override
	public Produto buscarPorId(int id) {
		return null;
	}

	@Override
	public void atualizar(Produto produto) {

	}

	@Override
	public void remover(int id) {

	}

	private boolean isListEmpty(){
		return this.lista.isEmpty();
    }
}
