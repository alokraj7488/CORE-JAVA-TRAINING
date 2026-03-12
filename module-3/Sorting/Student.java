/**
 * 
 */
package com.capgemini.module_3_Sorting;

/**
 * 
 */
public record Student(Integer id, String name, String mailId, Long contactNumber) implements Comparable<Student>{

//	@Override
//	public int compareTo(Student student) {
//		if(this.id() > student.id) {     // Sort by ID..!
//			return 1;
//		}
//		else if(this.id() < student.id) {
//			return -1;
//		}
//		else {
//			return 0;
//		}
//	}
	
//	@Override
//	public int compareTo(Student student) {
//		if(this.id() > student.id) {   // Sort by ID..!
//			return -1;
//		}
//		else if(this.id() < student.id) {
//			return 1;
//		}
//		else {
//			return 0;
//		}
//	}
	
	@Override
	public int compareTo(Student student) {
		if(this.contactNumber() > student.contactNumber) {   // Sort by Contact Number..!
			return 1;
		}
		else if(this.id() < student.id) {
			return -1;
		}
		else {
			return 0;
		}
	}
}
