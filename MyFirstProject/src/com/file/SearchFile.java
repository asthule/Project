package com.file;

import java.io.File;
import java.util.Scanner;

public class SearchFile {

	public static void main(String a[]) {
		
		SearchFile sf=new SearchFile();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file that has to be searched");
		String name=scanner.next();
		System.out.println("Enter the directory that has to be searched");
		String dir=scanner.next();
		sf.findFile(name, new File(dir));
		
	}
	
	void findFile(String name,File file) {
		
		File[] list=file.listFiles();
		if(list!=null) {
			for(File f1:list) {
				if(f1.isDirectory()) {
					findFile(name, f1);
				}
				else if(name.equalsIgnoreCase(f1.getName())) {
						System.out.println(f1.getParentFile());
				}
			}
			
		}
	}
}
