/**
 * 
 */
package com.capgemini.module_3_array.practice;

import java.lang.reflect.Array;
import java.util.*;

/**
 * 
 */
public interface EvenOdd {
	public static void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of Array: ");
		int n = sc.nextInt();
		Integer[] array = (Integer[]) Array.newInstance(Integer.class, n);

		for (int i = 0; i < array.length; i++) {
			Array.set(array, i, i+1);
		}

		System.out.println("Even Numbers: ");
		for (int j = 0; j < array.length; j++) {
			Integer k = (Integer) Array.get(array, j);
			if (k % 2 == 0) {
				System.out.print(k + " ");
			} 
		}
		System.out.println();
		System.out.println("Odd Numbers: ");
		for (int j = 0; j < array.length; j++) {
			Integer k = (Integer) Array.get(array, j);
			if (k % 2 != 0) {
				System.out.print(k + " ");
			} 
		}
	}
}
