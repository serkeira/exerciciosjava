package com.estoque.novo;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();
		
	}

	private void start() {
		
		Produto produto = new Produto();
		produto.nome = "Iphone 11 64GB";
		produto.quantidadeEstoque = 15;
		
		if (verificarEstoque(produto)) {
			System.out.println("Necessário repor o produto, pois há menos que 10 em estoque");
		} else {
			System.out.println("O produto está com estoque suficiente.");
		}
		
		
	}

	private boolean verificarEstoque(Produto produto) {
		Boolean necessarioRepor = produto.quantidadeEstoque < 10;
		return necessarioRepor;
		
	}

}
