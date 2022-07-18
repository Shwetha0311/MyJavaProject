package Practice;

import java.util.HashMap;

public class PracticeWithHashMap {

	public static void main(String[] args) {
HashMap <Integer, String> object = new HashMap<Integer, String>();
object.put(0,"Zero");
object.put(1, "One");
object.put(2, "Two");
object.put(3, "Three");
System.out.println("Hash map list");
System.out.println(object);
object.remove(2);
System.out.println("Removed an item");
System.out.println(object);
System.out.println("Accessing an item");
System.out.println(object.get(1));
System.out.println("Clearing all items");
object.clear();
System.out.println(object);

}
}
