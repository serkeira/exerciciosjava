import java.util.Scanner;

public class exercicio53 {

	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a nota de portugu�s: ");
		Double portugues = scanner.nextDouble();
		
		System.out.print("Digite a nota de matem�tica: ");
		Double matematica = scanner.nextDouble();
		
		Boolean aprovado = (matematica + portugues >= 150) && (matematica >= 60) && (portugues >= 60);
		
		if (aprovado)
		{
			System.out.println("Voc� foi aprovado!");
		}
		else
		{
			System.out.println("Voc� n�o foi aprovado!");
		}
		
		scanner.close();

	}

}
