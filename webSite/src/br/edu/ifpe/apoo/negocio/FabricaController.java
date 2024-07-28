package br.edu.ifpe.apoo.negocio;

public class FabricaController {
	public static IControllerProduto getControllerProduto() {
		return new ControllerProduto();
	}

}
