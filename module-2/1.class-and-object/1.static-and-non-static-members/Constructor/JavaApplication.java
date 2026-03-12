class JavaApplication {
	public static void execution() {
		// Test t1 = new Test();
		// Test t2 = new Test();


		// Student student1 = new Student();
		// System.out.println("Student1: " + student1);
		// student1.id = 1;
		// student1.name = "John";
		// student1.mailId = "john@gmail.com";
		// student1.contactNumber = 987654321l;
		// student1.displayStudentDetails();

		// Student student2 = new Student();
		// System.out.println("Student2: " + student2);
		// student2.id = 2;
		// student2.name = "Charlie";
		// student2.mailId = "charlie@gmail.com";
		// student2.contactNumber = 987674348l;
		// student2.displayStudentDetails();

// Same output with a better approach..!
		Student student1 = new Student(1, "John", "john@gmail.com", 987654321l);
		student1.displayStudentDetails();
		Student student2 = new Student(2, "Charlie", "charlie@gmail.com", 987674348l);
		student2.displayStudentDetails();
	}
}