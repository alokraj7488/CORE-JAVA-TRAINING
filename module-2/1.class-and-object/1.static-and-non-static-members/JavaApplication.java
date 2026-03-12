import java.util.*;

class JavaApplication {
	public static void execution() {
		// Student.city = "Jalandhar";
		// Student.state = "Punjab";
		// Student.country = "India";

		Student student1 = new Student();
		System.out.println("Student1: " + student1);
		// student1.id = 1;
		// student1.name = "John";
		// student1.mailId = "john@gmail.com";
		// student1.contactNumber = 987654321l;
		student1.displayStudentDetails();

		Student student2 = new Student();
		System.out.println("Student2: " + student2);
		// student2.id = 2;
		// student2.name = "Charlie";
		// student2.mailId = "charlie@gmail.com";
		// student2.contactNumber = 987674348l;
		student2.displayStudentDetails();




		// System.out.println(Members.sv);
		// Members.sm();

		// Members member = new Members();
		// System.out.println(member.nsv);
		// member.nsm();

	}
}
