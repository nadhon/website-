package br.edu.ifpe.apoo.negocio;

import br.edu.ifpe.apoo.execoes.ExecacaoNegocio;
import br.edu.ifpe.entidades.Produto;

public interface IControllerProduto {
    void inserir(Produto produto) throws ExecacaoNegocio.ExcecaoNegocio, ExecacaoNegocio;
}
