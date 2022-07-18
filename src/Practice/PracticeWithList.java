package Practice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PracticeWithList {

	public static void main(String[] args) {
List<String> animals = List.of("Dog","Cat","Lion");

ArrayList<String> arraylistobject = new ArrayList(animals);
arraylistobject.add("Tiger");
arraylistobject.add("Leopard");
System.out.println(arraylistobject.contains("Dog"));
System.out.println("Array List" +arraylistobject);
LinkedList<String> linkedlistobject = new LinkedList(animals);
System.out.println(linkedlistobject.getFirst());
System.out.println(linkedlistobject.isEmpty());

	}

}
