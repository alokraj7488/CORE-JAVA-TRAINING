/**
 * 
 */
package com.capgemini.java_development.module_3_file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 */
public class FileHandler {
	public static final String path = "D:\\Softwares\\1.Software\\JAVA_PROGRAMMING\\com.capgemini.java_development.module_3_file_handling\\src\\main\\java\\com\\capgemini\\java_development\\module_3_file_handling\\FilesPath\\Data.txt";
	public static final String data = "Welcome To Capgemini!!";
	public static File file;
	
	public static void create() throws Exception{
		file = new File(path);
		if(file.createNewFile()) {
			System.out.println("File Created!!");
		}
		else {
			System.out.println("File Already Exists!!");
		}
	}
	
	public static void update() throws IOException {
		FileWriter fileWriter = new FileWriter(file);
		fileWriter.write(data);
		fileWriter.flush();
		fileWriter.close();
		System.out.println("File Updated!!");
	}
	
	public static void read() throws FileNotFoundException, IOException {
		FileReader fileReader = new FileReader(file);
		int i;
		while((i = fileReader.read()) > 0) {
			System.out.print((char)i + " ");
		}
		System.out.println();
		fileReader.close();
	}
	
	public static void delete() {
		if(file.delete()) {
			System.out.println("File Deleted Succesfully!!");
		}
		else {
			System.out.println("File DOesn't Exists!!");
		}
	}
}
