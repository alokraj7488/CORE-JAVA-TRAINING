class PalindromeNumber {
	public static void palNum(int n) {
		int rem = 0;
		int rev = 0;
		int temp = n;
		while(temp != 0) {
			rem = temp % 10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}

		if(rev == n) {
			System.out.println("It's a Palindrome Number");
		}
		else {
			System.out.println("It's not a Palindrome Number");
		}
	}
}