package br.edu.ifpe.apoo.persistencia;

import br.edu.ifpe.entidades.Produto;

import java.util.List;

public interface FachadaPersistencia {
    void inserirProduto(Produto produto);
    void editarProduto(Produto produto);
    void removerProduto(int id);
    List<Produto> listaTudo();
}
