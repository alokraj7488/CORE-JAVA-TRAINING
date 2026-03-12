class Facebook extends SoftwareApplication {
	@Override
	public void open() {
		System.out.println("Facebook Opened");
	}

	@Override
	public void signUp() {
		System.out.println("Facebook Signed Up!");
	}

	@Override
	public void signIn() {
		System.out.println("Facebook Signed In!");
	}

	@Override
	public void signOut() {
		System.out.println("Facebook Signed Out!");
	}

	@Override
	public void close() {
		System.out.println("Facebook Closed");
	}
}