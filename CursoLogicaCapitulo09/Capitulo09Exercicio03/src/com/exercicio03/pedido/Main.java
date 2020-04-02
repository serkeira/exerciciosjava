package com.exercicio03.pedido;

public class Main {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		pedido.setCodigo(1);
		pedido.setSubtotal(450.0);
		pedido.setDesconto(50.0);
		//pedido.total = 400.0;
		
		System.out.println("Utilização de Métodos de Instância + Encapsulamento");
		System.out.println("-------------------");
		System.out.println(" ");
		
		System.out.println("[CÓDIGO]: " + pedido.getCodigo());
		System.out.println("[SUB-TOTAL]: R$ " + pedido.getSubtotal());
		System.out.println("[DESCONTO]: R$ " + pedido.getDesconto());
		System.out.println("[TOTAL]: R$ " + pedido.getTotal());
		
		

	}

}
