package lerarquivo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LerArquivo {

	public static void main(String[] args) throws IOException {
		LerArquivo app = new LerArquivo();
		app.start();
	}
	
	private void start() throws IOException {
		
		Path arquivo = Paths.get("C:/Temp/arquivo.txt");
		
		List<String> linhas = Files.readAllLines(arquivo);
		
		
		for (int i = 0; i < linhas.size(); i++) {
			String linha = linhas.get(i);
			System.out.println(linha);
			
		}
				
	}
	
	
	

}
