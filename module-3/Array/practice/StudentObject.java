/**
 * 
 */
package com.capgemini.module_3_array.practice;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * 
 */
public interface StudentObject {
	public static void stud() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Students: ");
		int n = sc.nextInt();
		Student[] students;
		students = (Student[]) Array.newInstance(Student.class, n);

		for (int i = 0; i < students.length; i++) {
			System.out.println("Enter the Student Id: ");
			Integer id = sc.nextInt();
			System.out.println("Enter the Student Name: ");
			String name = sc.next();
			System.out.println("Enter the Student Mail Id: ");
			String mailId = sc.next();
			Student student = new Student(id, name, mailId);
			Array.set(students, i, student);
		}
		for (int i = 0; i < students.length; i++) {
			System.out.println(Array.get(students, i));
		}
	}
}
