class TypeCasting {
	// public static void widening() {
	// 	int i = 10;
	// 	System.out.println("Value of int i is: " + i);
	// 	double d = i;
	// 	System.out.println("Value of doubele d is: " + d);
	// 	System.out.println();
	// }

	// public static void narrowing() {
	// 	double d = 12.87;
	// 	System.out.println("Value of doubele d is: " + d);
	// 	int i = (int)d;
	// 	System.out.println("Value of int i is: " + i);
	// }

	public static int widening(char c) {
		return c;
	}

	public static char narrowing(int i) {
		return (char)i;
	}
}