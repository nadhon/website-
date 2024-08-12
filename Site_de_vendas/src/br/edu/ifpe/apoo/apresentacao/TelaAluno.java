package br.edu.ifpe.apoo.apresentacao;

import java.util.Scanner;

import br.edu.ifpe.apoo.execoes.ExecacaoNegocio;
import br.edu.ifpe.apoo.negocio.FabricaController;
import br.edu.ifpe.apoo.negocio.IControllerProduto;
import br.edu.ifpe.entidades.Produto;

public class TelaAluno {
	Scanner scanner = new Scanner (System.in);

	public void exibir() {
		int opcao= 0;
		do {
			System.out.println("Bem vindo(a)");
			System.out.println("Digite 1 para cadastro: ");
			System.out.println("Digite 2 para editar os dados: ");
			System.out.println("Digite 3 para remover: ");
			System.out.println("Digite 4 para consultar: ");
			System.out.println("Digite 5 para sair: ");
			
			try {
				opcao = Integer.parseInt(scanner.nextLine());
			} catch (ClassCastException ex) {
				System.out.println("Digite um numero valido!");
				opcao = 0;
			}
			 switch (opcao) {
             case 1:
                 this.inserir();
                 break;
             case 2:
                 this.editar();
                 break;
             case 3:
                 this.remover();
                 break;
             case 4:
                 this.consultar();
                 break;
             case 5:
                 System.out.println("Saindo...");
                 break;
             default:
                 System.out.println("Opção inválida. Tente novamente.");
         }
     } while (opcao != 5);
 }
	private void consultar() {


    }
	private void remover() {
		
	}
	private void editar() {
	}
	private void inserir() {
		Produto produto = new Produto();
		produto.setNome(this.lerString("Nome"));
		produto.setID(this.lerString("ID"));
		produto.setValidade(this.lerString("Data_de_Validade"));
		IControllerProduto controller = FabricaController.getControllerProduto();
		try{
            try {
                controller.inserir(produto);
            } catch (ExecacaoNegocio.ExcecaoNegocio e) {
                throw new RuntimeException(e);
            }
        } catch (ExecacaoNegocio exception){
			System.out.println(exception.getMessage());
		}
	}
	
	private String lerString(String nomeAtributo) {
		String entrada = "";

		while (entrada.trim().length() == 0) {
			System.out.println("Digite o " + nomeAtributo + " do Produto: ");
			entrada = scanner.nextLine();
		}
		return entrada;
	}
}