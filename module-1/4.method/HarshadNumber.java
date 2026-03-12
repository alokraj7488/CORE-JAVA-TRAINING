// Number = 12 --> 1 + 2 = 3 --> if (12 / 3 == 0) - true else false;

class HarshadNumber {
	public static boolean check(int n) {
		int r = 0;
		int sum = 0;
		for(int t = n; t != 0; t = t / 10) {
			r = t % 10;
			sum += r;
		}
		if(n % sum == 0){
			return true;
		}
		return false;
	}
}