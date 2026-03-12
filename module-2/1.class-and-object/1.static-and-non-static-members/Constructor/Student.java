class Student {
	int id;
	String name;
	String mailId;
	long contactNumber;

	Student(int id, String name, String mailId, long contactNumber) {
		this.id = id;
		this.name = name;
		this.mailId = mailId;
		this.contactNumber = contactNumber;
	}

	static String city;
	static String state;
	static String country;

	static {
		city = "Banglore";
		state = "Karnataka";
		country = "India";
	}

	public void displayStudentDetails() {
		System.out.println();
		System.out.println("---------------");
		System.out.println("Student Details");
		System.out.println("---------------");
		System.out.println("Id: " + id);
		System.out.println("Name: " + name);
		System.out.println("Mail Id: " + mailId);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
	}
}