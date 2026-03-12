class IfElseIfStatement {
	public static void main(String[] args) {

		char signal = 'y';
		System.out.println("Signal is: " + signal);

		if((signal == 'r' || (signal == 'R'))) {
			System.out.println("Rukk jaa..!!");
		}
		else if((signal == 'y' || (signal == 'Y'))) {
			System.out.println("Taiyaar ho jaa..!!");
		}
		else {
			System.out.println("Chala jaa..!!");
		}
	}
}