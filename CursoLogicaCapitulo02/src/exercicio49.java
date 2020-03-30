import java.util.Scanner;

public class exercicio49 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		Double idade = scanner.nextDouble();
		
		System.out.print("Digite o tempo de contribuição em anos: ");
		Double tempo = scanner.nextDouble();
		
		Boolean podeAposentar = (idade >= 55) && (tempo >= 25);
		
		if (podeAposentar)
		{
			System.out.println("Você já pode se aposentar.");
		} else {
			System.out.println("Não pode se aposentar ainda.");
		}
		
		scanner.close();
	}

}
