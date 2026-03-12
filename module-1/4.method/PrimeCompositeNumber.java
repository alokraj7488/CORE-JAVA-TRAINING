class PrimeCompositeNumber {
	public static void primeComp(int n) {
		int c = 2;
		if((n > 0) && (n != 1)) {
			for(int i = 2; i < n; i++) {
				if(n % i == 0) {
					c++;
				}
			}
			if(c > 2) {
				System.out.println("It's a Composite Number");
			}
			else {
				System.out.println("It's an Even Number");
			}
		}
		else {
			System.out.println("...");
		}
	}
}