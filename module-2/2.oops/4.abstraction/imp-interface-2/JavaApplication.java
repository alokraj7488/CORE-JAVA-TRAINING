class JavaApplication {
	public static void execution() {
		Instagram instagram = new Instagram();
		instagram.open();
		instagram.signUp();
		instagram.signIn();
		instagram.signOut();
		instagram.close();
	
		System.out.println();
	
		Facebook faceBook = new Facebook();
		faceBook.open();
		faceBook.signUp();
		faceBook.signIn();
		faceBook.signOut();
		faceBook.close();
	}
}