package com.file;

import java.io.File;
import java.util.Scanner;

public class DeleteFile {

	public static void main(String a[]) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the file to be deleted..");
		String name=scanner.next();
		
		File file=new File(name);
		
		if(file.delete()) {
			System.out.println("File has been deleted");
		}
		
		else {
			System.out.println("Not deleted");
		}
	}
}
