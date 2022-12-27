package com.file;

import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingFiles {

	public static void main(String a[]) {
		
		File dir=new File("C:\\Users\\Spearline\\Documents\\GitHub\\Project\\MyFirstProject\\src\\");
		if(dir.isDirectory()) {
			
			List<String> list=Arrays.asList(dir.list());
			System.out.println("Files are still unsorted here");
			
			
			for(String s:list) {
				System.out.println(s);
			}
			
			System.out.println("Sorted files");
			Collections.sort(list);
		}
	}
}
