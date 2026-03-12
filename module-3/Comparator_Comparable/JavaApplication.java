/**
 * 
 */
package ArrayList_Comparator;

/**
 * 
 */
public interface JavaApplication {
	public static void execution() {
		CRUD.create();
		CRUD.read();
		CRUD.update();
		CRUD.read();
		CRUD.delete();
		CRUD.read();
		System.out.println(CRUD.students.size());
	}
}
