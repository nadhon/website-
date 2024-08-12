package br.edu.ifpe.apoo.persistencia;

import java.util.Optional;

import br.edu.ifpe.entidades.Produto;

import static java.lang.Integer.parseInt;

public class produtoDAO extends GenericDAO<Object>{

	private IProdutoDAO produtoDAOList;

	public Optional<Produto> buscarPorId(String id) {
		Produto produto = buscarPorId(parseInt(id));
		if (produto != null && produto.getID().equals(id)) {
			return Optional.of(produto);
		} else{
			System.out.println("Erro: Produto com ID"+ id+" não encontrado.");
			return Optional.empty();
		}


    }

	private String lerString(String id) {
        return id;
    }

	@Override
    public  Produto buscarPorId(int id) {
		// TODO Auto-generated method stub
		return produtoDAOList.buscarPorId(id);
	}
	public static void delete(Produto produto) {

	}

	public static void save(Produto produto) {


	}


}
