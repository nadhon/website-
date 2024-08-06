package br.edu.ifpe.apoo.persistencia;

import br.edu.ifpe.entidades.Produto;

import java.util.List;

public interface IProdutoDAO {
    void inserir(Produto produto);
    List<Produto> listarTodos();
    Produto buscarPorId(int id);
    void atualizar(Produto produto);
    void remover(int id);
}
