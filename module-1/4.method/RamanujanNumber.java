// Number = 1729 --> 1 + 9 = 19 --> rev = 91 --> 19 * 91 = 1729 --> true else false..

class RamanujanNumber {
	public static void isRaNum(int n) {
		int temp = n;
		int sum = 0;
		while(temp != 0) {
			int d = temp % 10;
			sum += d;
			temp /= 10;
		}

		int t = sum;
		int rev = 0;
		while(t != 0) {
			int rem = t % 10;
			rev = (rev * 10) + rem;
			t /= 10;
		}

		if((sum * rev) == n) {
			System.out.println("It's a Ramanujan Number");
		}
		else {
			System.out.println("It's not a Ramanujan Number");
		}
	}
}