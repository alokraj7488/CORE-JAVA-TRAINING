class NumberVerifierSystem {
	public static void main(String[] args) {
		int n = 0;
		if((n < 0) && (n % 2 == 0)) {
			System.out.println(n + " is a Negative and Even number.");
		}
		if((n < 0) && (n % 2 != 0)) {
			System.out.println(n + " is a Negative and Odd number.");
		}
		if((n == 0) && (n % 2 == 0) && (n / 2 == 0)) {
			System.out.println(n + " is a Neutral number.");
		}
		if((n > 0) && (n % 2 == 0)) {
			System.out.println(n + " is a Positive and Even number.");
		}
		if((n > 0) && (n % 2 == 0)) {
			System.out.println(n + " is a Positive and Odd number.");
		}
	}
}