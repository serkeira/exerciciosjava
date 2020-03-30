import java.util.Scanner;

public class calcularIMC {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o Peso: ");
		Double peso = scanner.nextDouble();
		
		System.out.print("Digite a Altura: ");
		Double altura = scanner.nextDouble();
		
		Double IMC = peso / (altura * altura);
		
		System.out.println("O IMC é: " + IMC);
		
		scanner.close();
		
	}
}
