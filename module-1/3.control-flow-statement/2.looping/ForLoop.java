class ForLoop {
	public static void main(String[] args) {
		int x = 10;
		for(int i = 1; i <= x; i++) {
			System.out.println('*');
		}

		for(int i = x; i >= 1; i--) {
			System.out.println('#');
		}
	}
}