/**
 * 
 */
package com.capgemini.module_3_string;

import java.util.Scanner;

/**
 * 
 */
public interface JavaApplication {
//	public static void execution() {
//		String s1 = "Java";
//		System.out.println(s1);
//		
//		String s2 = new String("Java");
//		System.out.println(s2);
//		
//		System.out.println(s1 == s2);
//		
//		System.out.println(s1.hashCode());
//		System.out.println(s2.hashCode());
//	}
//	
//	public static void execution1() {
//		StringBuilder f1 = new StringBuilder("Java");
//		System.out.println(f1);
//		
//		StringBuilder f2 = new StringBuilder("Java");
//		System.out.println(f2);
//		
//		System.out.println(f1.equals(f2));
//		
//		System.out.println(f1.hashCode());
//		System.out.println(f2.hashCode());
//	}
//	
//	public static void execution2() {
//		StringBuffer d1 = new StringBuffer("Java");
//		System.out.println(d1);
//		
//		StringBuffer d2 = new StringBuffer("java");
//		System.out.println(d2);
//		
//		System.out.println(d1.equals(d2));
//		
//		System.out.println(d1.hashCode());
//		System.out.println(d2.hashCode());
//	}
	
//	public static void execution3() {
//		String s1 = "09AZaz";
//		System.out.println(s1.length());
//		for(int i = 0; i < s1.length(); i++) {
//			System.out.println(s1.charAt(i) + " - " + s1.codePointAt(i));
//		}
//		System.out.println();
//	}
//	
//	public static void operations() {
//		String s1 = "core";
//		System.out.println(s1);
//		String s2 = s1.toUpperCase();
//		System.out.println(s2);
//		System.out.println(s1 == s2);
//		System.out.println();
//		
//		String s3 = "JAVA";
//		System.out.println(s3);
//		String s4 = s3.toLowerCase();
//		System.out.println(s4);
//		System.out.println(s3 == s4);
//		System.out.println();
//		
//		String s5 = "corejava";
//		System.out.println(s5);
//		String s6 = s5.substring(2, 7);   // Start Index -> Inclusive  & Last Index -> Exclusive
//		System.out.println(s6);
//		System.out.println();
//		
//		StringBuilder f1 = new StringBuilder();
//		f1.insert(0, "java");
//		System.out.println(f1);
//		f1.insert(0, "Hello ");
//		f1.setCharAt(6, 'J');
//		System.out.println(f1);
//		f1.deleteCharAt(6);
//		System.out.println(f1);
//		System.out.println(	);
//	}
	
//	public static void practiceQues1() {
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter String: ");
//		String s = sc.next();
//		
////		int i = 0; 
////		int j = s.length()-1;
////		boolean check = true;
////		while(i != j) {
////			if(s.charAt(i) != s.charAt(j)) {
////				System.out.println("Not a palindrome string");
////				check = false;
////				break;
////			}
////			i++;
////			j--;
////		}
////		if(check) {
////			System.out.println("Palindrome String");
////		}
//		
//		String rev = "";
//		char[] array = s.toCharArray();
//		for(int i = array.length-1; i >= 0; i--) {
//			rev += array[i];
//		}
//		
//		if(rev.equals(s)) {
//			System.out.println("Palindrome String");
//		}
//		else {
//			System.out.println("Not a Palindrome String");
//		}
	
	
//	}
	
	public static void practiceQues2() {
		StringBuilder s = new StringBuilder("corejava");
		String s1 = s.substring(0, 4);
		String s2 = s.substring(4, 8);
		String s3 = s1.toUpperCase();
		String s4 = "";
		char[] array = s2.toCharArray();
		for(int i = s2.length()-1; i >= 0; i--) {
			s4 += array[i];
		}
		String s5 = s4 + s3;
		System.out.println(s5);
	}
}