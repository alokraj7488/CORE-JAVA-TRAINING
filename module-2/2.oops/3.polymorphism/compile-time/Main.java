class Main {

// We can overload the main method as many number of times but..
// Compiler will first try to find the main method with String[] as parameter.
	
	// public static void main(char c) {
	// 	System.out.println("main(char)");
	// }

	public static void main(String[] args) {
		JavaApplication.execution();
	}

	// public static void main() {
	// 	System.out.println("main()");
	// }
}