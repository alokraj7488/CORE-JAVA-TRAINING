class SoftwareTrainer extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String department;
	static String branch;
	static String company;
	static {
		department = "Software training";
		branch = "Jalandhar";
		company = "Test yantra";
		city = "Amritsar";
		state = "Punjab";
		country = "India";
	}
	public void task() {
		System.out.println("training the trainee's");
	}
	public void reverseKT() {
		System.out.println("Explanation about latest software Development and testing tools and Technologies");
	}
	public void displaySoftwareTrainerInfo() {
		System.out.println();
		System.out.println("---------------------");
		System.out.println("Software Trainer info");
		System.out.println("---------------------");
		System.out.println("ID : "+id);
		System.out.println("Name : "+name);
		System.out.println("Mail Id : "+mailId);
	}
}