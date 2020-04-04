package com.serkeira.alphabetically;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		Main app = new Main();
		app.start();
	}
	
	private void start() throws IOException {
		
	Path file = Paths.get("C:/Temp/arquivo.txt"); // change to the original file path
		
	List<String> lines = Files.readAllLines(file);
	System.out.println("Reading the file...");
		
		
	lines.sort(String::compareToIgnoreCase); // sorting alphabetically
		
	
	Path file2 = Paths.get("C:/Temp/arquivo2.txt"); // output file with alphabetically sorted lines
	System.out.println("Writing the output file...");
	Files.write(file2, lines);
	System.out.println("DONE! You can now exit.");

	}

}
