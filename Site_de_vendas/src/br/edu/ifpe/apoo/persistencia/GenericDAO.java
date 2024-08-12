package br.edu.ifpe.apoo.persistencia;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Properties;

public class GenericDAO <T>{
	public  ArrayList<T> ProdutoDAOList = new ArrayList<>();
	private Properties ProdutoDaoList;

	public void save(T entidade) {
		ProdutoDAOList.add(entidade);
	}
	
	public void update(int index,T entidade) {
		if(index >=0 && index < ProdutoDaoList.size()) {
			ProdutoDAOList.set(index, entidade);
		} else {
			throw new IndexOutOfBoundsException("Index fora do limite");
		}
	}
	
	public void delete(T entidade) {
		ProdutoDAOList.remove(entidade);
	}
	
	public  Object buscarPorId(int index){
		if (index >= 0 && index <ProdutoDAOList.size()) {
            Optional<T> t = Optional.of(ProdutoDAOList.get(index));
            return t;
		} else return Optional.empty();
	}
	
	public List<T> procurarTudo(){
		return new ArrayList<>(ProdutoDAOList);
	}

	public void setProdutoDaoList(Properties produtoDaoList) {
		ProdutoDaoList = produtoDaoList;
	}
}
