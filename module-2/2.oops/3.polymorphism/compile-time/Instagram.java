class Instagram {
	public String username;
	public String password;
	public String mailId;
	public String captcha;
	public long contactNumber;
	public int otp;

	public void login(String username, String password) {
		this.username = username;
		this.password = password;
		System.out.println("Login Successful..!");
	}

	public void login(String username, String password, String captcha) {
		this.username = username;
		this.password = password;
		this.captcha = captcha;
		System.out.println("Login Successful..!");
	}

	public void login(long contactNumber, int otp) {
		this.contactNumber = contactNumber;
		this.otp = otp;
		System.out.println("Login Successful..!");
	}

	public void login(String mailId, int otp) {
		this.mailId = mailId;
		this.otp = otp;
		System.out.println("Login Successful..!");
	}
}