/**
 * 
 */
package module_3_collection_framework;

import java.util.HashMap;

/**
 * 
 */
public interface HashMapOperation {
	public static void map() {
		HashMap<Integer, Double> hash = new HashMap<Integer, Double>();
		hash.put(1,  45.23);
		hash.put(-2,  98.23);
		hash.put(3,  -26.89);
		hash.put(6,  -56.78);
		hash.put(-7,  65.24);
		
		System.out.println(hash);
		System.out.println(hash.keySet());
		System.out.println(hash.values());
		hash.replace(-2, 42.89);
		hash.remove(3);
		System.out.println(hash);
	}
}
