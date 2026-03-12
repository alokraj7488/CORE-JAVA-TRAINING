class JavaApplication {
	public static void execution() {
		
		System.out.println(Super.sv);
		Super.sm();
		
		Super sr = new Super();
		System.out.println(sr.nsv);
		sr.nsm();

		System.out.println(Sub.sv);
		Sub.sm();

		Sub sb = new Sub();
		System.out.println(sb.nsv);
		sb.nsm();
	}
}