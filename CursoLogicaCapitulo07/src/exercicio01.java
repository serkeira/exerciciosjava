import java.util.Scanner;

public class exercicio01 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String[] tarefas = new String[5];
		
		for (int i = 0; i < 5; i++)
		{
			System.out.print("Digite a tarefa mais importante de número " + (i+1) +": ");
			tarefas[i] = scanner.next();
		}
		
		System.out.println("As tarefas mais importantes são: ");
		
		for (int i = 0; i < tarefas.length; i++) {
			System.out.println("[" + (i+1) + "]" + tarefas[i]);
		}
		
		scanner.close();

	}

}
