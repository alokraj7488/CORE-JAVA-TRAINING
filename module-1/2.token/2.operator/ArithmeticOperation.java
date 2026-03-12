class ArithmeticOperation {
	public static void main(String[] args) {
		int a = 10;
		System.out.println("Value of a: " + a);

		int b = 5;
		System.out.println("Value of b: " + b);

		int c = a + b;
		System.out.println("Addition of " + a + " and " + b + ": " + c);

		int d = a - b;
		System.out.println("Subtraction of " + a + " and " + b + ": " + d);

		int x = a * b;
		System.out.println("Multiplication of " + a + " and " + b + ": " + x);

		int y = a / b;
		System.out.println("Division of " + a + " and " + b + ": " + y);
		
		int z = a % b;
		System.out.println("Modulo of " + a + " and " + b + ": " + z);
	}
}