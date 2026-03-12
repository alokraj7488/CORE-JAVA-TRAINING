/**
 * 
 */
package com.capgemini.module_3_array.practice;

import java.util.ArrayList;

/**
 * 
 */
public interface SearchingAlgorithm {
	public static void linearSearch1(Integer[] integers, int element) {
		int index = -1;
		for(int i = 0; i < integers.length; i++) {
			if(integers[i] == element) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			System.out.println(element + " Found at " + index);
		}
		else {
			System.out.println(element + " Not Found!!");
		}
		System.out.println();
	}
	
	public  static void linearSearch2(ArrayList<Integer> list, int element) {
		int index = -1;
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i) == element) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			System.out.println(element + " Found at " + index);
		}
		else {
			System.out.println(element + " Not Found!!");
		}
		System.out.println();
	}
}
