import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Type the first number: ");
		Double a = scanner.nextDouble();
		
		System.out.print("Type the second number: ");
		Double b = scanner.nextDouble();
		
		System.out.println("Type the operation number: ");
		System.out.println("[1] Sum ");
		System.out.println("[2] Subtract ");
		System.out.println("[3] Multiply ");
		System.out.println("[4] Divide ");
		System.out.print("Your choice: ");
		Integer operation = scanner.nextInt();
		Double result = 0.0;
		
		switch(operation) {
		case 1:
			result = sum(a, b);
			break;
		case 2:
			result = subtract(a, b);
			break;
		case 3:
			result = multiply(a, b);
			break;
		case 4:
			result = divide(a, b);
			break;
		default:
			System.err.println("You must type an operation number between 1-4!");
			System.exit(1);
		}
		
		
		System.out.println("The final result is: " + result);
		

	}
	
	// methods
	
	static Double sum(Double a, Double b) {
		Double result = a + b;
		return result;
	}
	
	static Double subtract(Double a, Double b) {
		Double result = a - b;
		return result;
	}
	
	static Double multiply(Double a, Double b) {
		Double result = a * b;
		return result;
	}
	
	static Double divide(Double a, Double b) {
		Double result = a / b;
		return result;
	}

}
