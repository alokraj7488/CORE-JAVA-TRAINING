/**
 * 
 */
package com.capgemini.module_3_array.practice;

/**
 * 
 */
public interface Sorting {
	public static void bubbleSortAsc(Integer[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1; j++) {
				int temp = 0;
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.print("Ascending Order: ");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static void bubbleSortDsc(Integer[] arr) {
		int n = arr.length;
		for(int i = 0; i < n-1; i++) {
			for(int j = 0; j < n-1; j++) {
				int temp = 0;
				if(arr[j] < arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		
		System.out.print("Descending Order: ");
		for(int a : arr) {
			
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static void AscDsc(Integer[] arr) {
		int n = arr.length;
		int mid = n / 2;
		for(int i = 0; i < mid-1; i++) {
			int temp = 0;
			for(int j = 0; j < mid-1; j++) {
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i = mid; i < n-1; i++) {
			int temp = 0;
			for(int j = mid; j < n-1; j++) {
				if(arr[j] < arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
//		for(int i = 0; i < n-1; i++) {
//			while(i < mid-1) {
//				int temp = 0;
//				for(int j = 0; j < mid-1; j++) {
//					if(arr[j] > arr[j+1]) {
//						temp = arr[j];
//						arr[j] = arr[j+1];
//						arr[j+1] = temp;
//					}
//				}
//			}
//		}
		
		System.out.println("Ascending till half then Descending to the End");
		for(int a : arr) {
			System.out.print(a + " ");
		}
		System.out.println();
	}
	
	public static void NumberSorting(int n) {
		int digit = 0;
		int temp = n;
		while(temp != 0) {
			digit++;
			temp /= 10;
		}
		
		Integer[] arr = new Integer[digit];
		int t = n;
		int i = 0;
		while(t != 0) {
			int d = t % 10;
			arr[i++] = d;
			t /= 10;
		}
		
		bubbleSortAsc(arr);
		bubbleSortDsc(arr);
		
		System.out.println();
	}
	
	public static void StringSorting(StringBuilder s) {
		int n = s.length();
		for(int i = 0; i < n-1; i++) {
			char c = 'a';
			for(int j = 0; j < n-1; j++) {
				if(s.charAt(j) > s.charAt(j+1)) {
					c = s.charAt(j);
					char t = s.charAt(j +1);
					s.setCharAt(j, t);
					s.setCharAt(j+1, c);
				}
			}
		}
		
		System.out.print("String after sorting: ");
		for(int i = 0; i < n; i++) {
			System.out.print(s.charAt(i) + " ");
		}
	}
}
