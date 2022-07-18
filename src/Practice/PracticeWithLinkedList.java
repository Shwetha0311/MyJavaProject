package Practice;

import java.util.LinkedList;

public class PracticeWithLinkedList {

	public static void main(String[] args) {
		LinkedList<String>  alphabets = new LinkedList<String>();
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		alphabets.add("A");
		alphabets.add("B");
		alphabets.add("C");
		System.out.println(alphabets);
	alphabets.addFirst("Z");
	alphabets.addLast("M");
	System.out.println(alphabets);
	System.out.println("First Element");
	System.out.println(alphabets.getFirst());
	System.out.println("Last Element");
	System.out.println(alphabets.getLast());	
		}
}
