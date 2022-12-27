package com.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class AddFile {

	public static void main(String a[]) throws IOException {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file that has to be added...");
		String name=scanner.next();
		
		
		Path path=Paths.get(name);
		Files.createDirectories(path.getParent());
		
		try {  
			Files.createFile(path);
		}
		catch(Exception e) {
			System.out.println(e.toString());
			
		}
	}
}
