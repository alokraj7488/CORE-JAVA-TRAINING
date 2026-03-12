import java.util.*;

class StudentOperation {

		int id;
		String name;
		long contactNumber;

		Scanner sc = new Scanner(System.in);

		public void insert() {
			System.out.print("Enter Student Id: ");
			id = sc.nextInt();
			System.out.println();
			System.out.print("Enter the Student name: ");
			sc.nextLine();
			name = sc.nextLine(); 
			System.out.println();
			System.out.print("Enter Contact Number: ");
			contactNumber = sc.nextLong();
			System.out.println();
		}
	
		public void read() {
			System.out.println("Id: " + id);
			System.out.println("Student name: " + name);
			System.out.println("Student's Contact Number: " + contactNumber);
		}

		public void update() {
			System.out.print("Enter new Contact Number: ");
			contactNumber = sc.nextLong();
			System.out.println("Student's data has been updated.");
		}

		public void exit() {
			System.out.println("-------------------------");
			System.out.println("Thank You! Visit Again..!");
			System.out.println("-------------------------");
		}
}