import java.util.Scanner;

public class exercicio53 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota de português: ");
		Double portugues = scanner.nextDouble();
		
		System.out.print("Digite a nota de matemática: ");
		Double matematica = scanner.nextDouble();
		
		Boolean aprovado = (matematica + portugues >= 150) && (matematica >= 60) && (portugues >= 60);
		
		if (aprovado)
		{
			System.out.println("Você foi aprovado!");
		}
		else
		{
			System.out.println("Você não foi aprovado!");
		}
		
		scanner.close();

	}

}
