import java.util.Scanner;

public class exercicio47 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		Double contaTotal = 0.0;
		
		System.out.print("Digite a conta de luz: ");
		Double luz = scanner.nextDouble();
		contaTotal += luz;
		
		System.out.print("Digite a conta de água: ");
		Double agua = scanner.nextDouble();
		contaTotal += agua;

		System.out.print("Digite a conta de telefone: ");
		Double telefone = scanner.nextDouble();
		contaTotal += telefone;
		
		System.out.print("Digite a conta da escola: ");
		Double escola = scanner.nextDouble();
		contaTotal += escola;
		
		System.out.print("Digite a fatura do cartão: ");
		Double cartao = scanner.nextDouble();
		contaTotal += cartao;
		
		System.out.print("Digite os gastos com supermercado: ");
		Double supermercado = scanner.nextDouble();
		contaTotal += supermercado;
		
		System.out.println("Conta total: R$" + contaTotal);
		
		scanner.close();
	}

}
