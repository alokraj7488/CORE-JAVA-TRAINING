class SoftwareDeveloper extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String department;
	static String branch;
	static String company;
	static {
		department = "Software Developer";
		branch = "Jalandhar";
		company = "Test Yantra";
		city = "Amritsar";
		state = "Punjab";
		country = "India";
	}

	public void task() {
		System.out.println("Software Development");
	}
	public void reverseKT() {
		System.out.println("Explanation about Latest Software Development Tools and Techniques.");
	}
	public void displaySoftwareDeveloperInfo() {
		System.out.println();
		System.out.println("-------------------------");
		System.out.println("Software Developer's Info");
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