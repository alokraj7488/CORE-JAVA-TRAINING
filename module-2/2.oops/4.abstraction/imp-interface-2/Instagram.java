class Instagram extends SoftwareApplication {
	@Override
	public void open() {
		System.out.println("Instagram Opened");
	}

	@Override
	public void signUp() {
		System.out.println("Instagram Signed Up!");
	}

	@Override
	public void signIn() {
		System.out.println("Instagram Signed In!");
	}

	@Override
	public void signOut() {
		System.out.println("Instagram Signed Out!");
	}

	@Override
	public void close() {
		System.out.println("Instagram Closed");
	}
}