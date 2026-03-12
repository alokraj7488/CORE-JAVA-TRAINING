class NumberDisplaySystem {
	public static void series(int x, int y) {
		if(x < y) {
			System.out.println("Forward Series..");
			for(int i = x; i <= y; i++) {
				System.out.println(i);
			}
			System.out.println();
		}
		else if(x > y){
			System.out.println("Backward Series..");
			for(int i = x; i >= y; i--) {
				System.out.println(i);
			}
			System.out.println();
		}
		else {
			System.out.println("Invalid Series..");
		}
	}
}