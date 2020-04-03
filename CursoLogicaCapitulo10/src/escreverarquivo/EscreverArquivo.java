package escreverarquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscreverArquivo {

	public static void main(String[] args) throws IOException {
		
		EscreverArquivo app = new EscreverArquivo();
		app.start();

	}
	
	private void start() throws IOException {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> linhas = new ArrayList<String>();
		
		int i = 1;
		
		
		while (true) {
			
			System.out.print("Digite a tarefa de número " + i + " ou digite 'x' para sair: ");
			String entrada = scanner.nextLine(); 
			linhas.add(entrada);
			
			
			if ("x".equals(entrada)) {
				System.err.println("Saindo... verifique o arquivo txt que foi criado com as " + i + " tarefas.");
				break;
				
			}
			
			i++;
		
		
		
		Path arquivo = Paths.get("C:/Temp/arquivo.txt");
		Files.write(arquivo, linhas);
		
		
		
	}

}
	
}
