/**
 * 
 */
package module_3_collection_framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;

/**
 * 
 */
public interface ListDemo {
	public static void list() {
		System.out.println("******ArrayList*******");
		System.out.println("-----------------------");
	// Homogeneous
		System.out.println("Homogeneous");
		ArrayList<Integer> l = new ArrayList<>();
		l.add(-10); l.add(-2); l.add(54); l.add(43);
		System.out.println(l);
		System.out.println();
		
	// Hetrogeneous
		System.out.println("Hetrogenous");
		ArrayList list = new ArrayList();
		list.add(-10); list.add(56); list.add(true); list.add("JavaCore"); list.add(new Product()); list.add(null);
		System.out.println(list);
		System.out.println();
	}
	
	public static void queue() {
		System.out.println("******PriorityQueue********");
		System.out.println("---------------------------");
	// Homogeneous
		System.out.println("Homogeneous");
		PriorityQueue<Double> p = new PriorityQueue<>();
		p.add(11.11); p.add(32.24); p.add(12.21); p.add(-45.11); p.add(-12.65);
		System.out.println(p);
		System.out.println();
		
	// Hetrogeneous --> Not Allowed
		System.out.println("Hetrogeneous");
		PriorityQueue p1 = new PriorityQueue();
		p1.add(11.11); p1.add(32.24); p1.add(12.21); p1.add(true); p1.add("Hello");  p1.add(null);
		System.out.println(p1);
		System.out.println();
	}
	
	public static void set() {
		System.out.println("******HashSet********");
		System.out.println("---------------------");
		System.out.println("Homogeneous");
	// Homogeneous
		HashSet<Character> s = new HashSet<>();
		s.add('q'); s.add('c'); s.add('m'); s.add('v');
		System.out.println(s);
		System.out.println();
		
	// Hetrogeneous
		System.out.println("Hetrogeneous");
		HashSet s1 = new HashSet();
		s1.add('q'); s1.add("Hey"); s1.add(true); s1.add('v');  s1.add(null);
		System.out.println(s1);
		System.out.println();
	}
	
	public static void map() {
		System.out.println("******HashMap********");
		System.out.println("---------------------");
	// Homogeneous
		System.out.println("Homogeneous");
		HashMap<Integer, String> map = new HashMap<>();
		map.put(1, "John"); map.put(2, "Charlie"); map.put(3, "Joe"); map.put(4, "Jennifer");
		System.out.println(map);
		System.out.println();
		
	// Hetrogeneous
		System.out.println("Hetrogeneous");
		HashMap map1 = new HashMap();
		map1.put(1, "John"); map1.put(2.56, 'c'); map1.put(3, true); map1.put(4, "Jennifer"); map1.put(5,  null);
		System.out.println(map1);
		System.out.println();
	}
}
