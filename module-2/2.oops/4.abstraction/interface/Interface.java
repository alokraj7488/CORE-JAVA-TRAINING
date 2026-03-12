interface Interface {
	public static void sm1() {
		System.out.println("Static sm1() of interface Interface");
	}

// We can use default modifier i.e, non static only in Interface
// Can be modified later on by other class(remove default --> public void nsm1(){...})
	public default void nsm1() {
		System.out.println("Non Static nsm1() of interface Interface");
	}

	public void nsm2();
}