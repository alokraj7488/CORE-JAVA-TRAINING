/**
 * 
 */
package com.capgemini.java_development.module_3_file_handling;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		try {
			FileHandler.create();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			FileHandler.update();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			FileHandler.read();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		FileHandler.delete();
	}
}
