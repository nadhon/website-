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
	protected static ProdutoDAOList getInstancia(){
		if(instancia == null){
			instancia = new ProdutoDAOList() ;
		}
        return instancia;
    }

	@Override
	public void inserir(Produto produto) {
		this.lista.add(produto) ;
	}
	private boolean isListEmpty(){
		return this.lista.isEmpty();
    }
}
