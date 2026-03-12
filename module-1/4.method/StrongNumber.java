// Number = 145 --> 1! + 4! + 5! = 1 + 24 + 120 = 145 - true..

class StrongNumber {
	public static void check(int n) {
		int r = 0;
		int sum = 0;
		for(int t = n; t != 0; t /= 10) {
			r = t % 10;
			sum += fact(r);
		}

		if(n == sum) {
			System.out.println("It is a Strong Number..");
		}
		else {
			System.out.println("It is not a Strong Number..");
		}
	}

	public static int fact(int n) {
		int f = 1;
		for(int i = 1; i <= n; i++) {
			f *= i;
		}
		return f;
	}
}