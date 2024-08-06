package br.edu.ifpe.apoo.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class GenericDAO <T>{
	private static List<T> bancodeDados = new ArrayList<>();
	
	public void save(T entidade) {
		bancodeDados.add(entidade);
	}
	
	public void update(int index,T entidade) {
		if(index >=0 && index < bancodeDados.size()) {
			bancodeDados.set(index, entidade);
		} else {
			throw new IndexOutOfBoundsException("Index fora do limite");
		}
	}
	
	public void delete(T entidade) {
		bancodeDados.remove(entidade);
	}
	
	public Object procurarID(int index){
		if (index >= 0 && index < bancodeDados.size()) {
            Optional<T> t = Optional.of(bancodeDados.get(index));
            return t;
		} else return Optional.empty();
	}
	
	public List<T> procurarTudo(){
		return new ArrayList<>(bancodeDados);
	}

}
