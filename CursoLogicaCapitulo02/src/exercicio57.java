import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class exercicio57 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o número do dia da semana de 1 a 7: ");
		Integer diaNumero = scanner.nextInt();
		String diaNome = "";
		
		switch (diaNumero) {
		case 1:
			diaNome = "Domingo";
			break;
		case 2:
			diaNome = "Segunda-Feira";
			break;
		case 3:
			diaNome = "Terça-Feira";
			break;
		case 4:
			diaNome = "Quarta-Feira";
			break;
		case 5:
			diaNome = "Quinta-Feira";
			break;
		case 6:
			diaNome = "Sexta-Feira";
			break;
		case 7:
			diaNome = "Sábado";
			break;
		default:
			System.err.println("Obrigatório digitar um número de 1 a 7.");
			System.exit(1);
		}
		
		System.out.println("O dia da semana digitado é: " + diaNome);
		
		scanner.close();

	}

}
