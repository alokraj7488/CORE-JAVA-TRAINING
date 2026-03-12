/**
 * 
 */
package dev_test;

/**
 * 
 */
public class JavaApplication {
	public static void execution1() {
		ProductPOJO product1 = new ProductPOJO(1, "Apsara", "Pencil", 29.99);
		System.out.println(product1);
		
		ProductPOJO product2 = new ProductPOJO(1, "Apsara", "Pencil", 29.99);
		System.out.println(product2);
		
		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
	}
	
	public static void execution2() {
		ProductBean product1 = new ProductBean(1, "Apsara", "Pencil", 29.99);
		System.out.println(product1);
		
		ProductBean product2 = new ProductBean(2, "Apsara", "Eraser", 9.99);
		System.out.println(product2);
		
		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
	}
	
	public static void execution3() {
		Product product1 = new Product(1, "Apsara", "Pencil", 29.99);
		System.out.println(product1);
		
		Product product2 = new Product(1, "Apsara", "Pencil", 29.99);
		System.out.println(product2);

		System.out.println(product1.equals(product2));
		System.out.println(product1.hashCode());
		System.out.println(product2.hashCode());
	}
}
