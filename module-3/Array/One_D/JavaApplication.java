/**
 * 
 */
package com.capgemini.module_3_array.One_D;

import java.lang.reflect.Array;


/**
 * 
 */
public interface JavaApplication {
	public static void execution1() {
		// declaration
		int[] array;
		// instantiation
		array = new int[3];
		// initialization
		array[0] = 1; array[1] = 2; array[2] = 3;
		// utilization - for loop
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// utilization - for each loop
		for (int i : array) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
	}
	
	public static void execution2() {
		int[] array = (int[]) Array.newInstance(int.class, 3);
		Array.setInt(array, 0, 1);
		Array.setInt(array, 1, 2);
		Array.setInt(array, 2, 3);
		for (int i = 0; i < array.length; i++) {
			System.out.println(Array.getInt(array, i));
		}
		System.out.println();
	}
	
	public static void execution3() {
		Integer[] array = (Integer[]) Array.newInstance(Integer.class, 10);
		for(int i = 0; i < array.length; i++) {
			Array.set(array, i, i+1);
		}
		for(int i = 0; i < array.length; i++) {
			System.out.println(Array.get(array, i));
		}
	}
}
