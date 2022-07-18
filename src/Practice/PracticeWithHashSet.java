package Practice;

import java.util.HashSet;

public class PracticeWithHashSet {

	public static void main(String[] args) {
HashSet<Integer> object = new HashSet<Integer>();
object.add(15);
object.add(20);
object.add(25);
object.add(30);
object.add(30);
object.add(35);
object.add(40);
System.out.println("List of items");
System.out.println(object);
System.out.println(object.contains(30));
System.out.println(object.contains(32));
object.remove(15);
System.out.println(object);
System.out.println("Clearing the list");
object.clear();
System.out.println(object);
	}
}
