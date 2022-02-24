package org.icici;

import java.io.File;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) throws IOException {

	//	File file = new File("D:\\kumar");
		// to create a folder
	//	boolean mkdir = file.mkdir();
	//	System.out.println(mkdir);

		//to create sub folders
		File file=new File("D:\\Vel\\kalai\\vani\\text.txt");

//		boolean mkdirs = file.mkdirs();
//		System.out.println(mkdirs);
	
		//to check whether the folder/file present or not
		boolean exists = file.exists();
		System.out.println(exists);
		
		//to create file.for file creation we need to hide mkdir().if mkdir present means it will create a folder...
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
		
		
		
		
		
		
		
	}

}
