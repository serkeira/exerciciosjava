package com.exercicio03.pedido;

public class Pedido {
	
	private Integer codigo;
	
	private Double subtotal;
	
	private Double desconto;
	
	//Double total;
	
	
	public Integer getCodigo() {
		return codigo;
	}
	void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	Double getSubtotal() {
		return subtotal;
	}
	void setSubtotal(Double subtotal) {
		this.subtotal = subtotal;
	}
	Double getDesconto() {
		return desconto;
	}
	void setDesconto(Double desconto) {
		this.desconto = desconto;
	}
	Double getTotal() {
		return this.subtotal - this.desconto;
	}
	void setTotal(Double total) {
		//this.total = total;
	}
	
	

}
