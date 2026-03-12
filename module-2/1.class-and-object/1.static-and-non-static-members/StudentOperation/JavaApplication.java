import java.util.*;

class JavaApplication {
	static StudentOperation st;
	public static void execution() {
		Scanner sc = new Scanner(System.in);
		boolean choice = true;
		do {
			System.out.println();
			System.out.println("------------------");
			System.out.println("*StudentOperation*");
			System.out.println("------------------");
			System.out.println("1. Create Student: ");
			System.out.println("2. Insert Student: ");
			System.out.println("3. Read Student: ");
			System.out.println("4. Update Student: ");
			System.out.println("5. Delete Student: ");
			System.out.println("6. Exit: ");
			System.out.println();
			System.out.print("Select Your Choice: ");
			int n = sc.nextInt();
			System.out.println();
			
			switch(n) {
				case 1: {
					st = new StudentOperation();
					System.out.println("New Student has been created.");
					break;
				}
				case 2: {
					st.insert();
					break;
				}
				case 3: {
					st.read();
					break;
				}
				case 4: {
					st.update();
					break;
				}
				case 5: {
					st = null;
					System.out.println("Student's data has been deleted.");
					break;
				}
				case 6: {
					st.exit();
					choice = false;
					break;
				}
				default: {
					System.out.println("Invalid Choice! Please Try Again..!");
				}
			}
		}while(choice);

	}
}
