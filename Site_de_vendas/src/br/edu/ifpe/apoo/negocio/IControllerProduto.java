package br.edu.ifpe.apoo.negocio;

import br.edu.ifpe.apoo.execoes.ExecacaoNegocio;
import br.edu.ifpe.entidades.Produto;

import java.util.List;

public interface IControllerProduto {
    void inserir(Produto produto) throws ExecacaoNegocio.ExcecaoNegocio, ExecacaoNegocio;

    Produto consultar(String id, Produto produto) throws ExecacaoNegocio;

    void remover(String id) throws ExecacaoNegocio;

    void editar(Produto produto);

    List<Produto> listar();
}
