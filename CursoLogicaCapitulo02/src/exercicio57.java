import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class exercicio57 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Digite o n�mero do dia da semana de 1 a 7: ");
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
			diaNome = "Ter�a-Feira";
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
			diaNome = "S�bado";
			break;
		default:
			System.err.println("Obrigat�rio digitar um n�mero de 1 a 7.");
			System.exit(1);
		}
		
		System.out.println("O dia da semana digitado �: " + diaNome);
		
		scanner.close();

	}

}
