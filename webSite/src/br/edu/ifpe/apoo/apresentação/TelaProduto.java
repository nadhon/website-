package br.edu.ifpe.apoo.apresentação;

import java.util.List;
import java.util.Scanner;

import br.edu.ifpe.apoo.entidade.Produto;
import br.edu.ifpe.apoo.excecoes.ExcecaoNegocio;
import br.edu.ifpe.apoo.negocio.FabricaController;
import br.edu.ifpe.apoo.negocio.IControllerProduto;

public class TelaProduto {
	Scanner scanner =  new Scanner(System.in);
	
	public void iniciar() throws ExcecaoNegocio{
		while(true) {
			exibir();
		}
	}
	
	public void exibir() throws ExcecaoNegocio {
		int opcao;
		do {
			System.out.println("Bem vindo(a)!");
			System.out.println("Digite 1 para cadastrar o produto: ");
			System.out.println("Digite 2 para Editar o produto: ");
			System.out.println("Digite 3 para Remover um produto: ");
			System.out.println("Digite 4 para consultar a lista de produtos: ");
			System.out.println("Digite 0 para Sair: ");
			
			try {
				opcao = Integer.parseInt(scanner.nextLine());
			} catch(NumberFormatException ex) {
				System.out.println("Digite um número valido!");
				opcao = -1;
			}
			
		
		} while(opcao <=0);
		
		switch(opcao) {
		case 1:
			this.inserir();
			break;
		case 2:
			this.editar();
			break;
		case 3:
		case 4:
			this.listarTodos();
			break;
		case 0:
			System.out.println("Saindo...");
			break;
		default:
			System.out.println("Opção Inválida.");
			break;
		}
	}
	private void inserir() throws ExcecaoNegocio {
		Produto produto = new Produto();
		produto.setNome(this.lerString("Nome"));
		produto.setID(this.lerInteger("ID"));
		produto.setPreço(this.lerFloat("preco"));
		
		IControllerProduto controller = FabricaController.getControllerProduto();
		try {
			controller.inserir(produto);
		} catch (ExcecaoNegocio e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	private String lerString(String nomeAtributo) {
		String entrada = "";
		while (entrada.trim().length()==0) {
			System.out.println("Digite o "+ nomeAtributo + " do Produto: ");
			entrada = scanner.nextLine();
		}
		return entrada;
	}
	private Integer lerInteger(final String nomeAtributo) {
		Integer entrada = null;
		while (entrada == null) {
			System.out.println("Digite o "+ nomeAtributo +" do Produto: ");
			String input = scanner.nextLine();
			try {
				entrada = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Entrada invalida. por favor digite o id correto");
			}
		}
		return entrada;
	}
	private Float lerFloat(String string) {
		Float entrada = 0f;
		while (entrada.floatValue()==0) {
			System.out.println("Digite o "+ string +" do Produto");
			entrada = scanner.nextFloat();
		}
		return entrada;
	}
	private void editar() {
		
		
	}
	private void listarTodos() {
		IControllerProduto controller = FabricaController.getControllerProduto();
		try {
			List<Produto> produtos = controller.listarTodos();
			if (produtos==null||produtos.isEmpty()) {
				System.out.println("Nenhum Produto Cadastrado. ");
			} else {
				System.out.println("Lista de Produtos: ");
				for (Produto produto: produtos) {
					System.out.println(produto);
				}
			}
		} catch(ExcecaoNegocio e) {
			System.out.println("Erro ao Listar produtos: "+ e.getMessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
			
}
