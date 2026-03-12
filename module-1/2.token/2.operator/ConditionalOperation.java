class ConditionalOperation {
	public static void main(String[] args) {
		int i = 10;
		System.out.println("Value of i is: " + i);

		int j = 50;
		System.out.println("Value of j is: " + j);

		boolean c = i > j;
		System.out.println("Value of i is greater than j: " + c);

		int d = c ? (i + j) : (i * j);
		System.out.println("Value of d is: " + d);

		char e = c ? 'i' : 'j';  // Indirect utilization..
		System.out.println("Value of " + e + " is greater..!");

		// Direct utilization..
		System.out.println(c ? 'J' : "Java");
	}
}