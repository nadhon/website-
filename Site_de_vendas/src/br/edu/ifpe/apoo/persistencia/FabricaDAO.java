package br.edu.ifpe.apoo.persistencia;

public class FabricaDAO {
    public static IProdutoDAO getProdutoDAO(){
        return ProdutoDAOList.getInstancia() ;
    }
}
