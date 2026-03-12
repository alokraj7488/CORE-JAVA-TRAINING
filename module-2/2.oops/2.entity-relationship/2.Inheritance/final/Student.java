class Student {
		final int id;
		final String name;
		final String mailId;
		final long contactNumber;
		Student(int id, String name, String mailId, long contactNumber) {
			this.id = id;
			this.name = name;
			this.mailId = mailId;
			this.contactNumber = contactNumber;
		}
		
		static final String city;
		static final String state;
		static final String country;
		static {
			city = "Jalandhar";
			state =  "Punjab";
			country = "India";
		}

	public void displayStudentInfo() {
		System.out.println();
		System.out.println("--------------");
		System.out.println("Student's Info");
		System.out.println("--------------");
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Mail ID: " + mailId);
		System.out.println("Contact Number: " + contactNumber);
		System.out.println("City: " + city);
		System.out.println("State: " + state);
		System.out.println("Country: " + country);
	}
}