/**
 * 
 */
package ArrayList_Comparator;

import java.util.*;

/**
 * 
 */
public interface CRUD {
	ArrayList<Student> students = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	public static void create() {
		System.out.println("Enter the number of Students: ");
		int n = sc.nextInt();
		for(int i = 0; i < n; i++) {
			System.out.print("\nEnter ID: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			System.out.print("Enter Mail ID: ");
			String mailId = sc.nextLine();
			System.out.print("Enter Contact Number: ");
			Long contactNumber = sc.nextLong();
			students.add(new Student(id, name, mailId, contactNumber));
		}
	}
	
	public static void read() {
		System.out.println();
		System.out.println("---------------------------------------------------");
		System.out.println("                    Student's Data                 ");
		System.out.println("---------------------------------------------------");
		for(int i = 0; i < students.size(); i++) {
			System.out.println(students.get(i));
		}
	}
	
	public static void update() {
		System.out.println("\nEnter the Student ID you want to Update: ");
		int updId = sc.nextInt();
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getId() == updId) {
				System.out.println("\n1. Name");
				System.out.println("2. Mail ID");
				System.out.println("3. Contact Number");
				System.out.println("\nEnter the field you want to Update: ");
				int  field = sc.nextInt();
				sc.nextLine();
				boolean valid = true;
				while(valid) {
					switch(field) {
						case 1 : {
							System.out.println("Enter new Name: ");
							String name = sc.nextLine();
							students.get(i).setName(name);
							System.out.println("Updated!!");
							valid = false;
							break;
						}
						case 2 : {
							System.out.println("\nEnter new Mail ID: ");
							String mailId = sc.nextLine();
							students.get(i).setName(mailId);
							System.out.println("Updated!!");
							valid = false;
							break;
						}
						case 3 : {
							System.out.println("\nEnter new Contact Number: ");
							Long contactNumber = sc.nextLong();
							students.get(i).setContactNumber(contactNumber);
							System.out.println("Updated!!");
							valid = false;
							break;
						}
						default : {
							System.out.println("Invalid Input..! Please Try Again!");
						}
					}
				}
			}
		}
	}
	
	public static void delete() {
		System.out.println("\nEnter the Student ID you want to Delete: ");
		int delId = sc.nextInt();
		for(int i = 0; i < students.size(); i++) {
			if(students.get(i).getId() == delId) {
				students.remove(i);
				System.out.println("\nStudent's data Deleted!!");
				break;
			}
		}
	}
}
