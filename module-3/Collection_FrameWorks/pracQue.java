/**
 * 
 */
package module_3_collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 */
public interface pracQue {
	public static void que1() {
		int num = 98789;
		int digit = 0;
		int temp = num;
		int rev = 0;
		while (temp != 0) {
			digit++;
			int rem = temp % 10;
			rev = (rev * 10) + rem;
			temp /= 10;
		}
		int t = num;
		int m = 0;
		int f = 0;
		int l = 0;
		int mid = (digit / 2) + 1;
		boolean last = true;
		while (t != 0) {
			if (last) {
				l = t % 10;
			}
			last = false;
			int r = t % 10;
			if (digit == mid) {
				m = r % 10;
			}
			if (t < 10) {
				f = t;
			}
			t /= 10;
			digit--;
		}

		System.out.println("Display First, Middle and Last element of <Number> " + num);
		System.out.println("First element of Number: " + f);
		System.out.println("Middle element of Number: " + m);
		System.out.println("Last element of Number: " + l);
		if (num == rev) {
			System.out.println("It's a Palindrome Number");
		} else {
			System.out.println("It's not a Palindrome Number");
		}
		System.out.println();

		
		
		String s = "32457";
		int k = s.length();
		System.out.println("Display First, Middle and Last element of <String> " + s);
		System.out.println("First element of String: " + s.charAt(0));
		System.out.println("Middle element of String: " + s.charAt(k / 2));
		System.out.println("Last element of String: " + s.charAt(k - 1));
		int i = 0;
		int j = s.length() - 1;
		boolean check = true;
		while (i != j) {
			if (s.charAt(i) != s.charAt(j)) {
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("It's a Palindrome Number");
		} else {
			System.out.println("It's not a Palindrome Number");
		}
		System.out.println();

		
		
		int[] arr = { 5, 3, 7, 2, 9 };
		System.out.println("Display First, Middle and Last element of <Array> ");
		System.out.println("First element of Array: " + arr[0]);
		System.out.println("Middle element of Array: " + arr[arr.length / 2]);
		System.out.println("Last element of Array: " + arr[arr.length - 1]);
		for (int x = 0; x < arr.length / 2; x++) {
			if (arr[x] != arr[x]) {

			}
		}
		System.out.println();

		
		
		ArrayList<Integer> list = new ArrayList<>();
		for (int z = 0; z < list.size(); z++) {

		}
		System.out.println("Display First, Middle and Last element of <ArrayList> ");
		System.out.println("First element of ArrayList: " + list.get(0));
		System.out.println("Middle element of ArrayList: " + list.get(list.size() / 2));
		System.out.println("Last element of ArrayList: " + list.get(list.size() - 1));
		System.out.println();
	}

	public static boolean checkForNine() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of Elements: ");
		int n = sc.nextInt();
		System.out.println();
		int[] arr = new int[n];
		System.out.println("Enter the elements of Array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		if (n < 1) return false;

		if (n > 1 && (arr[0] == 9 || arr[n-1] == 9)) return true;

		return false;
	}
	
	public static String frBk(String s, boolean check) {
		if(check) {
			return s.substring(0, 1);
		}
		
		return s.substring(s.length()-1, s.length());
	}
	
	public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if(aSmile && bSmile) {
			return true;
		}
		if(aSmile == false && bSmile == false) {
			return true;
		}
		return false;
	}
	
	public static int party(int amount, int candy, int tea) {
		int teaAmount = amount * tea;
		int candyAmount = amount * candy;
		if(tea >= (2*candyAmount) || candy >= (2*teaAmount)) {
			return 2;
		}
		if(candy >= 5 && tea >= 5){
			return 1;
		}
		return 0;
	}
	
	public static int[] swap() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int temp = arr[0];
		arr[0] = arr[n-1];
		arr[n-1] = temp;
		return arr;
	}
	
	public static int speed(boolean birthday, int s) {
		if(birthday) {
			s += 5;
		}
		
		if(s <= 60) {
			return 0;
		}
		else if(s <= 80 && s > 60) {
			return 1;
		}
		return 2;
	}	
	
	public static int greenLottery(int a, int b, int c) {
		if(a !=b && b != c && c != a) {
			return 0;
		}
		
		if( a == b && b == c && c == a) {
			return 20;
		}
		
		return 10;
	}
	
	public static int blueLottery(int a, int b, int c) {
		int sum1 = a + b;
		int sum2 = b + c;
		int sum3 = c + a;
		
		if(sum1 == 10 || sum2 == 10 || sum3 ==10) {
			return 10;
		}
		else if((sum1 >= (sum2 + 10)) || (sum1 >= (sum3 + 10))) {
			return 5;
		}
		return 0;
	}
	
	public static int[] array(int[] arr) {
		int n = arr.length;
		int[] arr1 = new int[2];
		if(n % 2 == 0) {
			int firstEle = (n / 2) - 1;
			int secondELe = n / 2;
			arr1[0] = arr[firstEle];
			arr1[1] = arr[secondELe];
			return arr1;
		}
		
		return new int[]{0, 0};
	}
	
}


