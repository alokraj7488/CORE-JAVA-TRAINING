import java.util.*;
class CalculateOperation {
	public static void calc() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your first number: ");
		int x = sc.nextInt();
		System.out.println("Enter your second number: ");
		int y = sc.nextInt();

		int choice;
		do {
			System.out.println();
			System.out.println("1. Addition, 2. Subtraction, 3. Multiplication, 4. Division, 5. Exit..");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt(); 
			switch (choice) {
				case 1: {
					System.out.println("Addition of " + x + " and " + y + " is: " + Math.addExact(x, y));
					break;
				}

				case 2: {
					System.out.println("Subtraction of " + x + " and " + y + " is: " + Math.subtractExact(x, y));
					break;
				}

				case 3: {
					System.out.println("Multiplication of " + x + " and " + y + " is: " + Math.multiplyExact(x, y));
					break;
				}

				case 4: {
					System.out.println("Division of " + x + " and " + y + " is: " + Math.floorDiv(x, y));
					break;
				}

				case 5: {
					System.out.println("Thank You! Visit Again..");
					break;
				}

				default: {
					System.out.println("Invalid Choice..");
				}
			}
		}while(choice != 5);	
	}
}