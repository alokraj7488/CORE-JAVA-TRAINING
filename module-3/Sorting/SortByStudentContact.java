/**
 * 
 */
package com.capgemini.module_3_Sorting;

import java.util.Comparator;

/**
 * 
 */
public record SortByStudentContact() implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return student1.contactNumber().compareTo(student2.contactNumber());
	}
	
}
