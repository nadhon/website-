package br.edu.ifpe.apoo.persistencia;

import java.util.Optional;

import br.edu.ifpe.entidades.Produto;

import static java.lang.Integer.parseInt;

public class produtoDAO extends GenericDAO<Object>{

	public Optional<Produto> procurarPorID(String id) {
		Produto produto = procurarID(parseInt(id));
		if (produto != null && produto.getID().equals(id)) {
			return Optional.of(produto);
		}
		return Optional.empty();
	}


	public static Produto procurarID() {
        return procurarID(0);
    }

    public static Produto procurarID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void delete(Produto produto) {


	}

	public static void save(Produto produto) {


	}


}
