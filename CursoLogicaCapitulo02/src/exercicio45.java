import java.util.Scanner;

public class exercicio45 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Valor do Produto: ");
		Double valorProduto = scanner.nextDouble();
		
		Double valorFinal = valorProduto;
		
		Boolean haFrete = valorProduto >= 100;
		
		if (!haFrete)
		{
			valorFinal = valorProduto + 15;
		}
		
		System.out.println("O valor final é: " + valorFinal);
		
		scanner.close();
		
		
	}
	
	
}
