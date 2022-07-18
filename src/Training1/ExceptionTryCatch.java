package Training1;

public class ExceptionTryCatch {

	public static void main(String[] args) {
	try {	
		int [] numbers = {10,20,30,40,50, 60, 70, 80};
		System.out.println(numbers[17]);
	}
	catch (Exception e) {
		System.out.println("Please enter number between 0 to 4");
	}
	finally 
	{
		System.out.println("Thank you for your business");
	}
	}

}
