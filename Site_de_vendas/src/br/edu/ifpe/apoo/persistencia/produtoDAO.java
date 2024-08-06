package br.edu.ifpe.apoo.persistencia;

import java.util.Optional;

import br.edu.ifpe.entidades.Produto;

import static java.lang.Integer.parseInt;

public class produtoDAO extends GenericDAO<Object>{

	public Optional<Produto> procurarPorID(String id) {
        if (procurarID(parseInt(id)) != null) {
            for(Produto p: procurarID(parseInt(id)))
                if (p.getID().equals(id)) {
                    return Optional.of(p);
                }
        }

        return Optional.empty();
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
