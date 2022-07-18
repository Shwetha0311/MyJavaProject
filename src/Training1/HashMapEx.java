package Training1;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		
	    HashMap<String, String> capitalCities = new HashMap<String, String>();
	    HashMap<Integer, String> cc = new HashMap<Integer, String> ();
	    
	    cc.put(20, "Milan");
	    cc.put(25,"Mumbai");
	    // Add keys and values (Country, City)
	    capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    capitalCities.put("India", "Delhi");
	    
	    System.out.println(capitalCities);
	    System.out.println(capitalCities.get("Germany"));
	    System.out.println(cc.get(20));
	    

	}
}
