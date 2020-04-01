import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		Exercicio04 app = new Exercicio04();
		app.start();
	}
	
	private void start() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Tabuada de: ");
		Integer multiplicando = scanner.nextInt();
		while (multiplicando == 0)
		{
			System.out.print("Favor digitar um número diferente de 0: ");
			multiplicando = scanner.nextInt();
		}
		
		imprimirTabuada(multiplicando, 0);
		
		scanner.close();
	
	}
	
	public void imprimirTabuada(Integer multiplicando, Integer multiplicador) {
		System.out.println(multiplicando + "x" + multiplicador + " = " + (multiplicando * multiplicador));
		
		if (++multiplicador <= 10) {
			imprimirTabuada(multiplicando, multiplicador); 
		}
	}

}

