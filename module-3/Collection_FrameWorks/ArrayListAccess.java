/**
 * 
 */
package module_3_collection_framework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 * 
 */
public interface ArrayListAccess {
	public static void access() {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(12); list.add(56); list.add(78); list.add(14);
		
		System.out.print(list + " ");
		System.out.println();
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
		}
		System.out.println();
		
		for(Integer integer : list) {
			System.out.print(integer + " ");
		}
		System.out.println();
		
		Iterator<Integer> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		ListIterator<Integer> listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			System.out.print(listIterator.next() + " ");
		}
		System.out.println();
		
		ListIterator<Integer> listIterator1 = list.listIterator(list.size());
		while(listIterator1.hasPrevious()) {
			System.out.print(listIterator1.previous() + " ");
		}
		System.out.println();
 	}
}
