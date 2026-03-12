class Son extends Father {
	@Override
	public void career() {
		System.out.println("Future Doctor!");
	}

// We can't override the final method of parent class..!
	// public void marriage() {
	// 	System.out.println("Love Marriage!");
	// }

// We can change the return type of method while overriding but it should be either the same class or the sub-class not the Super/Parent class..!
// Using Covariant method type, only for non-primitive data types.
	
	public ScientificCalculator buyCalculator() {
		return new ScientificCalculator();
	}
}
