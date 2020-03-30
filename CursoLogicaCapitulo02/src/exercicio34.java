import java.util.Scanner;

public class exercicio34 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		Double number1 = scanner.nextDouble();
		
		Double quadrado = number1*number1;
		System.out.print("O quadrado é: " + quadrado);
		
		scanner.close();
		
		
		
	}
}
