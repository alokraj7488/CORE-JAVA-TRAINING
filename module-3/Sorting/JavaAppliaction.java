/**
 * 
 */
package com.capgemini.module_3_Sorting;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 */
public interface JavaAppliaction {
	public static void display(Student[] students) {
		for(Student student : students) {
			System.out.println(student);
		}
		System.out.println();
	}
	
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		
		Student[] students = new Student[2];
		for(int i = 0; i < students.length; i++) {
			System.out.print("Enter ID: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("\nEnter Name: ");
			String name = sc.nextLine();
			System.out.print("\nEnter Mail ID: ");
			String mailId = sc.nextLine();
			System.out.print("\nEnter Contact Number: ");
			long contactNumber = sc.nextLong();
			students[i] = new Student(id, name, mailId, contactNumber); 
		}
		
//		students[0] = new Student(1, "John", "john@gmail.com", 987654321L);
//		students[1] = new Student(3, "Charlie", "charlie@gmail.com", 8956472355L);
//		students[2] = new Student(4, "Joe", "joe@gmail.com", 9975634585L);
//		students[3] = new Student(2, "Chloe", "chloe@gmail.com", 7785963454L);
		
		System.out.println();
		display(students);
		
	// Using Comparable..!
		
//		Arrays.sort(students);
//		display(students);
		
		
	// Using Comparator -> Standard Method..!
		
//		SortByStudentId sortByStudentId = new SortByStudentId();
//		Arrays.sort(students, sortByStudentId);
//		display(students);
		
		SortByStudentContact sortByStudentContact = new SortByStudentContact();
		Arrays.sort(students, sortByStudentContact);
		display(students);
	}
}
