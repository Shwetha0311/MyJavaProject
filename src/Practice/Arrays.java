package Practice;

public class Arrays {

	public static void main(String[] args) {
		//Array declaration
		int[] numbers = {10,20,30,40,50};
		String[] countries= {"India", "USA", "UK", "China", "Russia"};
		System.out.println(numbers[0]);
		System.out.println(countries[4]);
		//Array length
		System.out.println(numbers.length);
		System.out.println(countries.length);
		int i;
		//array loop
		for(i=0;i<=4;i++)
			System.out.println(numbers[i]);
		for(i=0;i<=4;i++)
System.out.println(countries[i]);
		//Multi dimensional arrays
		String[][] places = {{"Amritsar","Delhi","Chennai","Bangalore"},{"City 1","City 2", "City 3","City 4"}};
		System.out.println(places[0][0] + " is " +places[1][0]);
		System.out.println(places[0][1] + " is " + places[1][1]);
		System.out.println(places[0][2] + " is " + places[1][2]);
		System.out.println(places[0][3] + " is " + places[1][3]);
	
		
		}

}
