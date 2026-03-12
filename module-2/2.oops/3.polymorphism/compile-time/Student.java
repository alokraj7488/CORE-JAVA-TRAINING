import java.lang.Object;

class Student {
	String name;
	char gender;
	String mailId;
	long contactNumber;
	String dob;

	Student(String name, char gender, String dob) {
		super();
		this.name = name;
		this.gender = gender;
		this.dob = dob;
	}

	Student(String name, char gender, String dob, String mailId) {
		// this.name = name;
		// this.gender = gender;
		// this.dob = dob;

		this(name, gender, dob);
		this.mailId = mailId;
	}

	Student(String name, char gender, String dob, String mailId, long contactNumber) {
		// this.name = name;
		// this.gender = gender;
		// this.dob = dob;
		// this.mailId = mailId;
// Instead of writing all the fields again and again we can use --> this(actual arguments)
// because already the above Student() is having those details which are required.
		this(name, gender, dob, mailId);
		this.contactNumber = contactNumber;
	}

	public void displayStudentInfo() {
		System.out.println();
		System.out.println("--------------");
		System.out.println("Student's Info");
		System.out.println("--------------");
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Date of Birth: " + dob);
		System.out.println("Mail ID: " + mailId);
		System.out.println("Contact Number: " + contactNumber);
	}
}