package com.exercicio03.pedido;

public class Main {

	public static void main(String[] args) {

		Pedido pedido = new Pedido();
		pedido.codigo = 1;
		pedido.subtotal = 450.0;
		pedido.desconto = 50.0;
		//pedido.total = 400.0;
		
		System.out.println("Utiliza��o de M�todos de Inst�ncia + Encapsulamento");
		System.out.println("-------------------");
		System.out.println(" ");
		
		System.out.println("[C�DIGO]: " + pedido.getCodigo());
		System.out.println("[SUB-TOTAL]: R$ " + pedido.getSubtotal());
		System.out.println("[DESCONTO]: R$ " + pedido.getDesconto());
		System.out.println("[TOTAL]: R$ " + pedido.getTotal());
		
		

	}

}
