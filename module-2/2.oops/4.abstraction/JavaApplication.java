class JavaApplication {
	public  static void execution() {
		// Punjab punjab = new Punjab();
		// punjab.regionalLanguage();

		// Karnataka karnataka = new Karnataka();
		// karnataka.regionalLanguage();


		// SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper(1, "John", "john@gmail.com", 987654321l, "Software Developer", 98775.645, "Developer", 50654.65);
		// softwareDeveloper.employeeInfo();
		// softwareDeveloper.entry();
		// softwareDeveloper.login();
		// softwareDeveloper.meeting();
		// softwareDeveloper.reverseKT();
		// softwareDeveloper.task();
		// softwareDeveloper.logout();
		// softwareDeveloper.exit();


		SuperInterface.sm();
		SubConcreteClass subConcreteClass = new SubConcreteClass();
		System.out.println(subConcreteClass.c);

	// Interface doesn't allow subclasses to access the static methods because they are already complete/concrete..!
	// Interface convert all the variables fields by default to (public, static and final) and non static method to static..! 
		//subConcreteClass.sm();

		subConcreteClass.nsm();
	}
}