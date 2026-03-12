class Members {
	public static int sv;
	public static void sm() {
		System.out.println("sm()");
	}
	static {
		System.out.println("Static");
	}

	public String nsv;
	public void nsm() {
		System.out.println("nsm()");
	}
	{
		System.out.println("Non-Static");
	}
}