package br.edu.ifpe.apoo.persistencia;

import java.util.Optional;

import br.edu.ifpe.entidades.Produto;

public class produtoDAO extends GenericDAO<Object>{

	public Optional<Produto> procurarPorID(String id) {
		for(Produto p: procurarID()) {
			if(p.getID().equals(id)) {
				return Optional.of(p);
			}
		}
		
		return Optional.empty();
	}

	public static Produto[] procurarID() {
		// TODO Auto-generated method stub
		return null;
	}

	public static void delete(Produto produto) {
		
		
	}

	public static void save(Produto produto) {
		
		
	}


}
