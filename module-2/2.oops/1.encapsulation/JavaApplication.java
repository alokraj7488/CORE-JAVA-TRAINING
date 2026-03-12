import java.util.*;

class JavaApplication {
	static Employee e;
	public static void execution() {
		// Student s = new Student();
	//Unsafe method - Direct Access..!
		// System.out.println(s.id);
		// System.out.println(s.name);

	// Unsafe Method - Can modify the data..!
		// s.id = 1;
		// s.name = "John";
		// System.out.println(s.id);
		// System.out.println(s.name);

// Safe Method - Using getter and setter method and Private to prevent the access as per requirements..!
		
		// Student s = new Student();
		// s.setId(121);
		// s.setName("John");
		// System.out.println(s.getId());
		// System.out.println(s.getName());


		Scanner sc = new Scanner(System.in);
		boolean check = true;

		do {
			System.out.println();
			System.out.println("----------------");
			System.out.println("Employee's Data");
			System.out.println("----------------");
			System.out.println();
			System.out.println("1. Create");
			System.out.println("2. Read");
			System.out.println("3. Update");
			System.out.println("4. Delete");
			System.out.println("5. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			System.out.println();
			switch(choice) {
				case 1: {
					System.out.print("Enter ID: ");
					int id = sc.nextInt();
					System.out.println();
					sc.nextLine();
					System.out.print("Enter Name: ");
					String name = sc.nextLine();
					System.out.println();
					System.out.print("Enter Contact Number: ");
					long contactNumber = sc.nextLong();
					System.out.println();
					sc.nextLine();
					System.out.print("Enter Mail ID: ");
					String mailId = sc.nextLine();
					System.out.println();
					System.out.print("Enter Designation: ");
					String designation = sc.nextLine();
					System.out.println();
					e = new Employee(id, name, contactNumber, mailId, designation);
					System.out.println("New Employee's data added..!");
					break;
				}
				case 2: {
					System.out.println("Id: " + e.getId());
					System.out.println("Name: " + e.getName());
					System.out.println("Contact Number: " + e.getContactNumber());
					System.out.println("Mail Id: " + e.getMailId());
					System.out.println("Designation: " + e.getDesignation());
					break;
				} 
				case 3: {
					System.out.print("Enter new Contact Number: ");
					long contactNumber = sc.nextLong();
					e.setContactNumber(contactNumber);
					System.out.println();
					sc.nextLine();
					System.out.print("Enter new Designation: ");
					String designation = sc.nextLine();
					e.setDesignation(designation);
					System.out.println();
					System.out.println("Updated Successfully..!");
					System.out.println("Updated Contact Number: " + e.getContactNumber());
					System.out.println("Updated Designation: " + e.getDesignation());
					break;
				}
				case 4: {
					e = null;
					System.out.println("Employee'd data deleted successfully..!");
					break;
				} 
				case 5: {
					System.out.println("Thank You! Visit Again..!");
					check = false;
					break;
				}
				default: {
					System.out.println("Invalid Choice..! Please Try Again..!");
				}
			}
		}while(check);
	}
}