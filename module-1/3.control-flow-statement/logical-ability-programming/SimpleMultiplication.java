// Write a java program to display the multiplication table for the given integer type input.
/* Write a java program to display the multiplication table in forward and backward series of 
   even and odd numbers respectively for the given integer type inputs.
*/

import java.util.*;

class SimpleMultiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}