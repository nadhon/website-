package br.edu.ifpe.apoo.persistencia;

import static br.edu.ifpe.apoo.persistencia.ProdutoDAOList.*;
import static br.edu.ifpe.apoo.persistencia.ProdutoDAOList.getInstancia;

public class FabricaDAO {
    public static IProdutoDAO getProdutoDAO(){
        return ProdutoDAOList.getInstancia() ;
    }
}
