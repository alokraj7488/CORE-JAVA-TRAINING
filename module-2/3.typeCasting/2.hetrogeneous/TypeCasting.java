class TypeCasting {
	public static void boxing() {
		int i = 10;
		System.out.println("i is: " + i);
		Integer I = Integer.valueOf(i); // Boxing
		System.out.println("I is: " + I);
		System.out.println();
	}
	public static void autoBoxing() {
		int i = 10;
		System.out.println("i is: " + i);
		Integer I = i; // autoBoxing
		System.out.println("I is: " + I);
		System.out.println();
	}

	public static void unBoxing() {
		Double D = Double.valueOf(12.34);
		System.out.println("D is: " + D);
		double d = D.doubleValue(); // unBoxing
		System.out.println("d is: " + d);
		System.out.println();
	}
	public static void autoUnBoxing() {
		Double D = Double.valueOf(12.34);
		System.out.println("D is: " + D);
		double d = D; // autoUnBoxing
		System.out.println("d is: " + d);
		System.out.println();
	}
}