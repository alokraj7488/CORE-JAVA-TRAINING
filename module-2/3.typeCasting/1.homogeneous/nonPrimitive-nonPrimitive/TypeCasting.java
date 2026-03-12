class TypeCasting {
	public static void upcastingDowncasting() {
		//generic container
		Employee employee;
		employee = new SoftwareDeveloper();

		employee.entry();
		employee.login();
		employee.shortBreak();
		employee.meeting();
		employee.logOut();
		employee.exit();

		//Specific container
		SoftwareDeveloper softwareDeveloper = (SoftwareDeveloper)employee;
		softwareDeveloper.displaySoftwareDeveloperInfo();
		softwareDeveloper.reverseKT();
		softwareDeveloper.task();

		System.out.println();

		//generic container
		employee = new SoftwareTester();
		
		employee.entry();
		employee.login();
		employee.shortBreak();
		employee.meeting();
		employee.logOut();
		employee.exit();

		//Specific container
		SoftwareTester softwareTester = (SoftwareTester)employee;
		softwareTester.displaySoftwareTesterInfo();
		softwareTester.reverseKT();
		softwareTester.task();

	}
}