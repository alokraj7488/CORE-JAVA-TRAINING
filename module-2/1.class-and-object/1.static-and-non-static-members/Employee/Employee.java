class Employee {

	int id;
	String name;
	String mailId;
	long contactNumber;
	long aadharNumber;
	String panNumber;
	String dateOfBirth;
	int age;
	char gender;
	String maritalStatus;
	static String company;     // static is used for common details..
	String branch;
	String department;
	String reportingManager;
	String designation;
	double salary;
	double roleIncentive;
	long uanNumber;
	int yearOfExperience;
	String city;
	String state;
	String country;


	public void displayEmployeeDetails() {
		System.out.println();
		System.out.println("Employee Details");
		System.out.println("----------------");
		System.out.println();
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Mail Id: " + mailId);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("Aadhar Number: " + aadharNumber);
		System.out.println("Pan Number: " + panNumber);
		System.out.println("Date of Birht: " + dateOfBirth);
		System.out.println("Age: " + age);
		System.out.println("Gender: " + gender);
		System.out.println("Marital Status: " + maritalStatus);
		System.out.println("Branch: " + branch);
		System.out.println("Department: " + department);
		System.out.println("Reporting Manager: " + reportingManager);
		System.out.println("Designation: " + designation);
		System.out.println("Salary: " + salary);
		System.out.println("Role Incentives: " + roleIncentive);
		System.out.println("UAN Number: " + uanNumber);
		System.out.println("Year of Experience: " + yearOfExperience);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
		System.out.println();
	}

	public void entry() {
		System.out.println("Welcome " + name + "!");
	}

	public void login() {
		System.out.println("You are logged in!");
	}

	public void shortBreak() {
		System.out.println(name + " took a shortBreak.");
	}

	public void task() {
		System.out.println("Today, you have to work on a new Project.");
	}

	public void update() {
		System.out.println("New Project has been delayed for some time.");
	}

	public void meeting() {
		System.out.println("Your meeting is scheduled for tomorrow.");
	}

	public void reverseKt() {
		System.out.println("Today, " + name + " has worked on static and non-static concept.");
	}

	public void longBreak() {
		System.out.println("Your break timing is 01:00 P.M - 02:00 P.M");
	}

	public void logout() {
		System.out.println("You have been successfully logged out!");
	}

	public void exit() {
		System.out.println("Exit..!");	
	}
}