package Training1;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList<String> cars = new ArrayList<String>();
		
		cars.add("Volvo");
		cars.add("Honda");
		cars.add("BMW");
		cars.add("Audi");
		System.out.println(cars);
		System.out.println(cars.get(3));

	}

}
