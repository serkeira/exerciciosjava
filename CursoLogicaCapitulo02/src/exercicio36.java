import java.util.Scanner;

public class exercicio36 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite o sobrenome: ");
		String sobrenome = scanner.nextLine();
		
		System.out.print(nome+" "+sobrenome);
		
		scanner.close();
		
	}
	
}
