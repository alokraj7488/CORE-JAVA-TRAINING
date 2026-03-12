//Write a java program to display all the digits from the given integer-typed number.

class Digit{
	public static void main(String[] args) {
		int num = 987654;
		int t = num;
		while(t > 0) {
			int x = t % 10;
			System.out.println(x);
			t /= 10;
		}
	}
}