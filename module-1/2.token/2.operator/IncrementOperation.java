class IncrementOperation {
	public static void main(String[] args) {
		int i = 10;
		System.out.println("Value of i is: " + i);

		int j = 20;
		System.out.println("Value of j is: " + j);

		int inc = ++i - j++ + i++ - ++j;
		System.out.println("Value of inc is: " + inc);
		System.out.println();

		System.out.println("Value of i is: " + i);
		System.out.println("Value of j is: " + j);
	}
}