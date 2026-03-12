class JavaApplication {
	public static void execution() {
		Parent p = new Parent();
		System.out.println(p instanceof Parent);
		System.out.println(p instanceof child);

		child c = new child();
		System.out.println(c instanceof child);
		System.out.println(c instanceof Parent);
	}

}