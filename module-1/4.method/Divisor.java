class Divisor {
	public static void div(int n) {
		for(int i = 1; i <= n/2; i++) {
			if(n % i == 0) {
				System.out.println(i);
			}
		}
	}
}