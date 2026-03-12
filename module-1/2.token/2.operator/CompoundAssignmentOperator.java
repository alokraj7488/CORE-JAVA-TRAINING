class CompoundAssignmentOperator {
	public static void main (String[] args) {
		int i = 10;
		System.out.println("Value of i is: " + i);

		i += 25; // i = i + 25;
		System.out.println("New Value of i after += 25 is: " + i);

		i -= 5; // i = i - 5;
		System.out.println("New Value of i after -= 5 is: " + i);

		i *= 2; // i = i * 2;
		System.out.println("New Value of i after *= 2 is: " + i);

		i /= 5; // i = i / 5;
		System.out.println("New Value of i after /= 5 is: " + i);

		i %= 3; // i = i % 3;
		System.out.println("New Value of i after %= 3 is: " + i);
	}
}