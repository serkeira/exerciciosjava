import java.util.Scanner;

public class exercicio55 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a meta de faturamento: ");
		Double meta = scanner.nextDouble();
				
		System.out.print("Digite o faturamento real do último ano: ");
		Double faturamentoUltimoAno = scanner.nextDouble();
		
		System.out.print("Digite a média salarial: ");
		Double mediaSalario = scanner.nextDouble();
		Double bonus = 0.0;
		
		
		if (faturamentoUltimoAno >= meta)
		{
			bonus = mediaSalario;
			System.out.print("O valor do bônus é de: " + bonus);
		}
		if (faturamentoUltimoAno < meta && faturamentoUltimoAno >= (0.8 * meta))   
		{
			bonus = ( 0.8 * mediaSalario);
			System.out.print("O valor do bônus é de: " + bonus);
		} 
		else if (faturamentoUltimoAno < meta)
		{
			System.out.println("Não tem direito a bônus.");
		}
		
		
		
		scanner.close();

	}

}
