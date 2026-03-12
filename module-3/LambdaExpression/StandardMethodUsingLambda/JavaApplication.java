/**
 * 
 */
package standardMethodUsingLambda;

/**
 * 
 */
public interface JavaApplication {
	// Using lambda expression to override the abstract method of MyInterface..!!!
	// Lambda Expression is used here because it's a standard method to override instead of using implements..!! (For Interface type)
	
	MyInterface myInterface = () -> {         
		System.out.println("method()");
	};
	
	Adder adder = (a, b) -> {
		return a + b;
	};
	public static void execution() {
		
	// Traditional Method..!
//		MyClass myClass = new MyClass();
//		myClass.method();
//		
		myInterface.method();
		
		MultiThreadedSystem.process();
		
		System.out.println(adder.add(5, 9));
		System.out.println(adder.add(2, 7));
		System.out.println(adder.add(4, 2));
	}
}
