package Training;

public class StaticMethodReturn {

	static int myReturn (int x ) {
		return 5 - x;
		
		
	}
	
	  static void checkAge(int age) {

		    // If age is less than 18, print "access denied"
		    if (age < 18) {
		      System.out.println("Access denied - You are not old enough!");

		    // If age is greater than 18, print "access granted"
		    } else {
		      System.out.println("Access granted - You are old enough!");
		    }
		  }


	public static void main(String[] args) {
		
		System.out.println(myReturn(150));
		
		checkAge(17);
		checkAge(18);
		checkAge(21);

	}

}
