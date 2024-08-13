package br.edu.ifpe.apoo.negocio;

import br.edu.ifpe.apoo.execoes.ExecacaoNegocio;
import br.edu.ifpe.apoo.persistencia.IProdutoDAO;
import br.edu.ifpe.apoo.persistencia.ProdutoDAOList;
import br.edu.ifpe.entidades.Produto;

import java.util.List;

public class ControladorProduto implements IControllerProduto{
    private Object FabricaDAO;

    public void inserir(Produto produto) throws ExecacaoNegocio{
        if (!this.isValido(produto)){
            throw new ExecacaoNegocio("Produto inserido!");
        }
        IProdutoDAO dao = ProdutoDAOList.getInstancia();
        dao.inserir(produto);
    }

    @Override
    public Produto consultar(String id, Produto Produto) {
        return Produto;
    }

    @Override
    public void remover(String id) {

    }

    @Override
    public void editar(Produto produto) {

    }

    @Override
    public List<Produto> listar() {
        return List.of();
    }

    private boolean isValido(Produto produto){

        return false;
    }
}
