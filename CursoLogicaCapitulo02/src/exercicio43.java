import java.util.Scanner;

public class exercicio43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o n�mero 1: ");
		Double numero1 = scanner.nextDouble();
		
		System.out.print("Digite o n�mero 2: ");
		Double numero2 = scanner.nextDouble();
		
		System.out.print("Digite a opera��o: ");
		Double operacao = scanner.nextDouble();
		
		Double result = 0.0;
		
		if (operacao == 1)
		{
			result = numero1 + numero2;
		}
		if (operacao == 2)
		{
			result = numero1 - numero2;
		}
		if (operacao == 3)
		{
			result = numero1 * numero2;
		}
		if (operacao == 4)
		{
			result = numero1 / numero2;
		}
		
		System.out.println("O resultado �: " + result);
		scanner.close();
	}
}
