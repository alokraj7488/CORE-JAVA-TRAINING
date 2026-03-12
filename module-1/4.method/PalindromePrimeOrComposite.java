class PalindromePrimeOrComposite {
	public static void palPrimeComp(int n) {
		if(pal(n)) {
			int c = 2;
			for(int i = 2; i <= n/2 ; i++) {
				if(n % i == 0) {
					c++;
				}
			}
			if(c > 2){
				System.out.println("It's a Palindrome Composite Number.");
			}
			else {
				System.out.println("It's a Palindrome Prime Number.");
			}
		}
		else {
			System.out.println("Neither a Palindrome Prime nor a Palindrome Composite Number.");
		}

	}

	public static boolean pal(int n) {
		int temp = n;
		int rem = 0;
		int rev = 0;
		while(temp != 0) {
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}
		if(rev == n) {
			return true;
		}
		else {
			return false;
		}
	}
}