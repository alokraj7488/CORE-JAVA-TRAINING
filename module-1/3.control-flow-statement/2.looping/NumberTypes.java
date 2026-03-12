/* Write a Java program to design and develop the Java Application to achieve the business logic implementation as follows:-

1. Autobiographical Number 
2. Spy Number
3. Beautiful Number
4. Super Number   */

// 1. Autobiographical Number - If the Digit count and Digit Sum is same.
// 2. Spy Number - If the Digit Sum and Digit Product is same.
// 3. Beautiful Number - If the number of Even Digit Count and Odd Digit Count is same.
// 4. Super Number - If the sum of total Even Digit and sum of total Odd Digit is same. 

class NumberTypes {
	public static void main(String[] args) {
		System.out.println(autobiographical(2020));
		System.out.println(spy(1111));
	}

	public static boolean autobiographical(int num) {
		int t1 = num;
		int count = 0;
		int sum = 0;
		while(t1 != 0) {
			count++;
			sum += (t1 % 10);
			t1 /= 10;
		}
		return count==sum;
	}

	public static boolean spy(int num) {
		int t1 = num;
		int sum = 0;
		int pdt = 1;
		while(t1 != 0) {
			sum += (t1 % 10);
			pdt *= (t1 % 10);
			t1 /= 10;
		}
		return sum == pdt;
	}
}