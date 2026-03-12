import java.util.*;

class LogicalMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println();

		if((n >= 1) && (n <= 10)) {
			for(int x = 2; x <= 10; x+=2) {
				for(int i = 1; i <= 10; i++) {
					System.out.println(x + " * " + i + " = " + (x * i));
				}
				System.out.println();
			}
		}
		else if((n >= 11) && (n <= 20)) {
			for(int x = 19; x >= 11; x-=2) {
				for(int i = 10; i >= 1; i--) {
					System.out.println(x + " * " + i + " = " + (x * i));
				}
				System.out.println();
			}
		}
		else {
			System.out.println("Enter the valid number between 1 to 20");
		}
	}
}