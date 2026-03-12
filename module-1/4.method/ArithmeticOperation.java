class ArithmeticOperation {
	public static void addition(int i, int j) {
		System.out.println("Value of i is: " + i);
		System.out.println("Value of j is: " + j);
		int z = i + j;
		System.out.println("Addition of " + i + " and " + j + " is: " + z);
		System.out.println();
	}

	public static void subtraction(int i, int j) {
		System.out.println("Value of i is: " + i);
		System.out.println("Value of j is: " + j);
		int z = i - j;
		System.out.println("Subtraction of " + i + " and " + j + " is: " + z);
		System.out.println();
	}

	public static void multiplication(int i, int j) {
		System.out.println("Value of i is: " + i);
		System.out.println("Value of j is: " + j);
		int z = i * j;
		System.out.println("Multiplication of " + i + " and " + j + " is: " + z);
		System.out.println();
	}

	public static void division(int i, int j) {
		System.out.println("Value of i is: " + i);
		System.out.println("Value of j is: " + j);
		int z = i / j;
		System.out.println("Division of " + i + " and " + j + " is: " + z);
		System.out.println();
	}
}