/**
 * 
 */
package com.capgemini.module_3_exception_handling;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public interface JavaApplication {
	public static void execution1() {
		int i = 10;
		System.out.println("i is : " + i);
		int j = 0;
		System.out.println("j is : " + j);
		try {
			int q = i / j;
			System.out.println("Division of " + i + " and " + j + " is : " + q);
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println("Cannot Divide any Number by Zero!!");
		}
		System.out.println();
	}
	
	public static void execution2() {
		try {
//			String s = "Java";
			String s = null;
			System.out.println(s + " " + s.length());
		}
		catch(NullPointerException nullPointerException) {
			System.out.println("Cannot Point Null with Anything");
		}
		System.out.println();
	}
	
	public static void execution3() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(2); list.add(4); list.add(8); list.add(3);
		try {
			for(int i = 0; i <= list.size(); i++) {
				System.out.print(list.get(i) + " ");
			}
		}
		catch(IndexOutOfBoundsException indexOutOfBoundsException) {
			System.out.println("Exceeding the Index Limitation of ArrayList");
		}
		System.out.println();
	}
	
	public static void execution4() {
		int[] arr = {1, -8, 5, -3, 6, 7};
		try {
			for(int i = 0; i <= arr.length; i++) {
				System.out.print(arr[i] + " ");
			}
		}
		catch(ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
			System.out.println("Exceeding the Index Limitation of Array");
		}
		System.out.println();
	}
	
	public static void execution5() {
		try {
			String s = "JavaProgramming";
			for(int i = 0; i <= s.length(); i++) {
				System.out.print(s.charAt(i) + " ");
			}
		}
		catch(StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
			System.out.println("Exceeding the Index Limitation of String");
		}
		System.out.println();
	}
	
	public static void execution6() {
		int i = 10;
		System.out.println("i is : " + i);
		int j = 0;
		System.out.println("j is : " + j);
		try {
			int q = i / j;
			System.out.println("Division of " + i + " and " + j + " is : " + q);
		}
		catch(ArithmeticException arithmeticException) {
			System.out.println(arithmeticException.getMessage());
			System.out.println(arithmeticException.toString());
			arithmeticException.printStackTrace();
		}
		System.out.println();
	}
	
	public static void execution7() {
		try {
			ArrayList<Integer> list = new ArrayList<>();
			for(int i = 0; i < list.size(); i++) {
				list.add(i + 1);
			}
			for(int a : list) {
				System.out.print(a + " ");
			}
			System.out.println();
			
			Integer[] arr = new Integer[5];
			for(int i = 0; i < 5; i++) {
				arr[i] = i + 1;
			}
			for(int b : arr) {
				System.out.print(b + " ");
			}
			System.out.println();
			
			String s = "JAVA PROGRAMMING";
			for(int i = 0; i <= s.length(); i++) {
				System.out.print(s.charAt(i) + " ");
			}
			System.out.println();
		}
		catch(Throwable throwable) {
			throwable.printStackTrace();
			System.out.println("Exception Handled!!");
		}
		System.out.println();
	}
	
	public static void execution8() {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the ID: ");
			int id = sc.nextInt();
			System.out.println("ID: " + id);
			System.out.println("Enter the Contact Number: ");
			long contactNumber = sc.nextLong();
			System.out.println("Contact Number: " + contactNumber);
		}
		catch(Throwable throwable) {
			System.out.println("Invalid Input! Please Try Again!!");
		}
		finally {
			sc.close();
			System.out.println("Resource Closed!!");
		}
	}
}
