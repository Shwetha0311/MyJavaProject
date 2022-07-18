package Practice;

import java.util.ArrayList;
import java.util.Collections;  

public class PracticeWithArrayList
{
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		cars.add(" BMW");
		cars.add("Volvo");
		cars.add("Audi");
		numbers.add(25);
		numbers.add(30);
		numbers.add(45);
		System.out.println(cars);
		System.out.println(numbers);
		cars.remove(2);
		numbers.remove(1);
		System.out.println(cars);
		System.out.println(numbers);
		System.out.println("Usage of get method");
		System.out.println(cars.get(0));
		System.out.println(numbers.get(1));
		System.out.println("Usage of set method");
		cars.set(1, "Honda");
		numbers.set(0, 50);
		System.out.println(cars);
		System.out.println(numbers);
		System.out.println("Length of cars array");
		System.out.println(cars.size());
		System.out.println("Length of numbers array");
		System.out.println(numbers.size());
		System.out.println("Sorting the cars array");
Collections.sort(cars);
System.out.println(cars);
System.out.println("Sorting the numbers array");
Collections.sort(numbers);
System.out.println(numbers);
}
}