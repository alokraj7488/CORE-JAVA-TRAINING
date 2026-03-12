// Number = 135 --> 1 + (3)^2 + (5)^3 = 1 + 9 + 125 = 135 --> true else false..
import java.util.*;
class Disarium {
	public static void disNum(int n) {
		int temp = n;
		int digit = 0;
		while(temp != 0) {
			digit++;
			temp /= 10;
		}

		int sum = 0;
		int t = n;
		while(t != 0) {
			int d = t % 10;
			int x = (int) Math.pow(d, digit);
			sum += x;
			digit--;
			t /= 10;
		}

		if(sum == n) {
			System.out.println("It's a Disarium Number");
		}
		else {
			System.out.println("It's not a Disarium Number");
		}
	}
}