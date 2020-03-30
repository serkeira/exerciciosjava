import java.util.Scanner;

public class exercicio311 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do Produto: ");
		Double valorProd = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do Produto: ");
		Double quantProd = scanner.nextDouble();
		
		Double subTotal = valorProd * quantProd;
		
		Boolean aplicarDesconto = quantProd >= 10;
		Double valorFinal = 0.0;
		Double desconto = 0.0;
		
		if (aplicarDesconto)
		{
			desconto = subTotal * 10 / 100;
		} 
		
		valorFinal = subTotal - desconto;
		
		
		System.out.println("O Valor Final é: " + valorFinal);
		scanner.close();
	}
	
}
