class SoftwareTester extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String department;
	static String branch;
	static String company;
	static {
		department = "Software Tester";
		branch = "Jalandhar";
		company = "Test Yantra";
		city = "Amritsar";
		state = "Punjab";
		country = "India";
	}

	public void task() {
		System.out.println("Software Testing");
	}
	public void reverseKT() {
		System.out.println("Explanation about Latest Software Testing Tools and Techniques.");
	}
	public void displaySoftwareTesterInfo() {
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Software Tester's Info");
		System.out.println("-------------------------");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Mail ID: " + mailId);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Branch: " + branch);
		System.out.println("Company: " + company);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println("Role: " + role);
		System.out.println("Incentive: " + incentive);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
	}	
}