package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class PracticeWithIterator {

	public static void main(String[] args) {
List<String> animals = List.of("Dog","Cat","Lion");

ArrayList<String> arraylistobject = new ArrayList(animals);
arraylistobject.add("Tiger");
arraylistobject.add("Leopard");
arraylistobject.contains("Dog");
System.out.println("Accessing elements of the arraylist using the for loop");
System.out.println("==============================================================");
for(int i=0;i<arraylistobject.size();i++)
	System.out.println(arraylistobject.get(i));
System.out.println("Accessing elements of the arraylist using the iterator method");
System.out.println("==============================================================");
Iterator<String> words = animals.iterator();
while(words.hasNext())
{
	System.out.println(words.next());
	}
}
}
