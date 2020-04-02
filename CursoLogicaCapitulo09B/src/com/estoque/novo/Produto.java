package com.estoque.novo;

public class Produto {
	
	String nome;
	
	Integer quantidadeEstoque;
	
	
	Boolean verificarEstoque() {
		Boolean necessarioRepor = quantidadeEstoque < 10;
		return necessarioRepor;
		
	}

}
