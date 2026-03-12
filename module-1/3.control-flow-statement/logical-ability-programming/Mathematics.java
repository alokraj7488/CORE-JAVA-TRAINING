// Write a java program to display square, cube, square root, and cube root of the given integer type number.

import java.util.*;

class Mathematics {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("1. Square");
		System.out.println("2. Square root");
		System.out.println("3. Cube");
		System.out.println("4. Cube root");
		System.out.println();
		
		System.out.print("Enter your choice: ");
		int choice = sc.nextInt();
		System.out.println();

		switch(choice) {
			case 1: {
				System.out.print("Enter the number: ");
				int n = sc.nextInt();
				System.out.println();
				System.out.println("Square of " + n + " is: " + (n * n));
				break;
			}
			case 2: {
				System.out.print("Enter the number: ");
				int n = sc.nextInt();
				System.out.println();
				for( int i = 1; i <= n / 2; i++) {
					if((i * i) == n) {
						System.out.println("Square root of " + n + " is: " + i);
						break;
					}
					else if((n > (i * i)) && (n < ((i + 1) * (i + 1)))) {
						System.out.println("Square root of " + n + " is: " + (double)(n / i));
						break;
					}
					else {
						continue;
					}
				}
				break;
			}
			case 3: {
				System.out.print("Enter the number: ");
				int n = sc.nextInt();
				System.out.println();
				System.out.println("Cube of " + n + " is: " + ((n * n) * n));
				break;
			}
			case 4: {
				System.out.print("Enter the number: ");
				int n = sc.nextInt();
				System.out.println();
				for( int i = 1; i <= n / 2; i++) {
					if(((i * i) * i) == n) {
						System.out.println("Cube root of " + n + " is: "  + i);
						break;
					}
					else if((n > ((i * i) * i)) && (n < (((i + 1) * (i + 1)) * (i + 1)))) {
						System.out.println("Cube root of " + n + " is: "  + (double)(n / i));
						break;
					}
					else {
						continue;
					}
				}
				break;
			}
			default: {
				System.out.println("Invalid choice..! Please Try Again..!");
			}
		}
	}
}