/**
 * 
 */
package com.capgemini.module_3_array.practice;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * 
 */
public interface StoreDisplay {
//	public static void digits() {
//		Character[] array = (Character[]) Array.newInstance(Character.class, 10);
//		for(int i = 0; i < array.length; i++) {
//			Array.set(array, i, i);
//		}
//		
//		for(int j = 0; j < array.length; j++) {
//			System.out.print(Array.get(array, j) + " ");
//		}
//		System.out.println();
//	}

	public static void upperCase() {
		System.out.println("UpperCase Alphabets: ");
		Character[] array = (Character[]) Array.newInstance(Character.class, 26);
		Integer i = 0;
		for (char c = 'A'; c <= 'Z'; c++) {
			Array.set(array, i++, c);
		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(Array.get(array, j) + " ");
		}
		System.out.println();
	}

	public static void lowerCase() {
		System.out.println("LowerCase Alphabets: ");
		Character[] array = (Character[]) Array.newInstance(Character.class, 26);
		Integer i = 0;
		for (char c = 'a'; c <= 'z'; c++) {
			Array.set(array, i++, c);
		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(Array.get(array, j) + " ");
		}
		System.out.println();
	}

	public static void weekDays() {
		Scanner sc = new Scanner(System.in);
		String[] array = (String[]) Array.newInstance(String.class, 7);
		System.out.println("Enter the Days of the week: ");
		for (int s = 0; s < array.length; s++) {
			Array.set(array, s, sc.nextLine());
		}

		for (int j = 0; j < array.length; j++) {
			System.out.print(Array.get(array, j) + " ");
		}
		System.out.println();
	}

	public static void monthYear() {
		String[] array = (String[]) Array.newInstance(String.class, 12);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Month of the Year: ");
		for (int i = 0; i < array.length; i++) {
			Array.set(array, i, sc.nextLine());
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(Array.get(array, i) + " ");
		}
		System.out.println();
	}

	public static void directions() {
		String[] array = (String[]) Array.newInstance(String.class, 8);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the directions of the compass: ");
		for (int i = 0; i < array.length; i++) {
			Array.set(array, i, sc.nextLine());
		}

		for (int i = 0; i < array.length; i++) {
			System.out.print(Array.get(array, i) + " ");
		}
	}
}
