import java.util.Scanner;

public class exercicio38 {
	
	static final Integer NOTA_MINIMA = 70;
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite a nota: ");
		Double nota = scanner.nextDouble();
		
		Boolean passou = nota > NOTA_MINIMA;
		
		if (passou)
		{
			System.out.println("Passou!");
		}
		else
		{
			System.out.println("Não passou!");
		}
		
	}

}
