class JavaApplication {
	public static void execution() {
		Employee.company = "Capegemini";

		Employee emp1 = new Employee();
		System.out.println("Employee 1: " + emp1);
		emp1.id = 1;
		emp1.name = "John";
		emp1.mailId = "john@gmail.com";
		emp1.contactNumber = 987654321l;
		emp1.aadharNumber = 987432105547l;
		emp1.panNumber = "7B564E01";
		emp1.dateOfBirth = "01/01/2000";
		emp1.age = 25;
		emp1.gender = 'M';
		emp1.maritalStatus = "Married";
		emp1.branch = "Software";
		emp1.department = "Testing";
		emp1.reportingManager = "Shiv Raj";
		emp1.designation = "Tester";
		emp1.salary = 925000.0;
		emp1.roleIncentive = 50000.0;
		emp1.uanNumber = 65478784614l;
		emp1.yearOfExperience = 5;
		emp1.city = "Jalandhar";
		emp1.state = "Punjab";
		emp1.country = "India";
		emp1.displayEmployeeDetails();
		emp1.entry();
		emp1.login();
		emp1.shortBreak();
		emp1.task();
		emp1.update();
		emp1.meeting();
		emp1.reverseKt();
		emp1.longBreak();
		emp1.logout();
		emp1.exit();


		Employee emp2 = new Employee();
		System.out.println("Employee 2: " + emp2);
		emp2.id = 2;
		emp2.name = "Charlie";
		emp2.mailId = "charlie@gmail.com";
		emp2.contactNumber = 9567304321l;
		emp2.aadharNumber = 984432325547l;
		emp2.panNumber = "7P324D31";
		emp2.dateOfBirth = "12/10/2002";
		emp2.age = 23;
		emp2.gender = 'M';
		emp2.maritalStatus = "Unmarried";
		emp2.branch = "Software";
		emp2.department = "Developer";
		emp2.reportingManager = "Shiv Raj";
		emp2.designation = "Software Developer";
		emp2.salary = 1205000.0;
		emp2.roleIncentive = 45000.0;
		emp2.uanNumber = 64568424614l;
		emp2.yearOfExperience = 3;
		emp2.city = "Ludhiana";
		emp2.state = "Punjab";
		emp2.country = "India";
		emp2.displayEmployeeDetails();
		emp2.entry();
		emp2.login();
		emp2.shortBreak();
		emp2.task();
		emp2.update();
		emp2.meeting();
		emp2.reverseKt();
		emp2.longBreak();
		emp2.logout();
		emp2.exit();
	}
}