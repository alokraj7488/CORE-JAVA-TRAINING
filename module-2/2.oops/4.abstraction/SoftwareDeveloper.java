class SoftwareDeveloper extends Employee {
	String designation;
	double salary;
	String role;
	double incentive;
	static String branch;
	static String department;
	static String company;

	static {
		city = "Jalandhar";
		state = "Punjab";
		country = "India";
		branch = "Amritsar";
		department = "SoftwareDevelopment";
		company = "Capgemini";
	}

	SoftwareDeveloper
	(
		int id, String name, String mailId, long contactNumber, 
		String designation, double salary, String role, double incentive
	) {
		super(id, name, mailId, contactNumber);
		this.designation = designation;
		this.salary = salary;
		this.role = role;
		this.incentive = incentive;
	}

	@Override 
	public void reverseKT() {
		System.out.println("Explanation about Latest Software Development Tools and Techniques.");
	}

	@Override
	public void task() {
		System.out.println("Software Development");
	}

	@Override
	public void employeeInfo() {
		System.out.println();
		System.out.println("---------------");
		System.out.println("Employee's Info");
		System.out.println("---------------");
		System.out.println("ID: " + super.id);
		System.out.println("Name: " + super.name);
		System.out.println("Mail ID: " + super.mailId);
		System.out.println("Contact Number: " + this.contactNumber);
		System.out.println("Designation: " + this.designation);
		System.out.println("Salary: " + this.salary);
		System.out.println("Role: " + this.role);
		System.out.println("Incentive: " + this.incentive);
		System.out.println("Branch: " + branch);
		System.out.println("Department; " + department);
		System.out.println("Company: " + company);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
	}
}