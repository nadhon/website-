package br.edu.ifpe.apoo.negocio;

import java.util.List;

import br.edu.ifpe.apoo.entidade.Produto;
import br.edu.ifpe.apoo.excecoes.ExcecaoNegocio;
import br.edu.ifpe.apoo.persistencia.FabricaDAO;
import br.edu.ifpe.apoo.persistencia.IProdutoDAO;
import br.edu.ifpe.apoo.persistencia.ProdutoDAOList;

public class ControllerProduto implements IControllerProduto{
	private ProdutoDAOList dao = ProdutoDAOList.getInstancia();
	@Override
	public void inserir(Produto produto) throws Exception {
		if (!this.isValido(produto)) {
			throw new Exception("Produto Invalido!");
		}
		IProdutoDAO dao = FabricaDAO.getProdutoDAO();
		dao.inserir(produto);
	}
	public void editar(Produto produto) throws ExcecaoNegocio{

	}
	private boolean isValido(Produto produto) {
		if(produto.getNome()==null || produto.getNome().trim().isEmpty()) {
			return true;
		}
		if(produto.getID() == null || produto.getID() <=0) {
			return true;
		}
		return true;
		
	}
	@Override
	public List<Produto> listarTodos() throws ExcecaoNegocio{
		return dao.listarTodos();
	}
	
}
