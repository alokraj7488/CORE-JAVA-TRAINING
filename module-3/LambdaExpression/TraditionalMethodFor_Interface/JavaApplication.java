/**
 * 
 */
package traditionalMethod_forInterface;

/**
 * 
 */
public interface JavaApplication {
	// Using lambda expression to override the abstract method of MyInterface..!!!
	// Lambda Expression is used here because it's a standard method to override instead of using implements..!! (For Interface type)
	MyInterface myInterface = () -> {         
		System.out.println("method()");
	};
	public static void execution() {
		MyClass myClass = new MyClass();
		myClass.method();
		
		myInterface.method();
	}
}
