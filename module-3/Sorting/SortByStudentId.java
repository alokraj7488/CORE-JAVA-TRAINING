/**
 * 
 */
package com.capgemini.module_3_Sorting;

import java.util.Comparator;

/**
 * 
 */
public record SortByStudentId() implements Comparator<Student>{

	@Override
	public int compare(Student student1, Student student2) {
		return student1.id().compareTo(student2.id());
	}
	
}
