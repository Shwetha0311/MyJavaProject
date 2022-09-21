package Practice;

import java.util.Scanner;

public class TryandCatch {

	public static void main(String[] args) {
		System.out.println("We are calculating the area of a rectange");
		
		try{
			System.out.println("Enter the length of the rectangle");
		Scanner input = new Scanner(System.in);
		int length = input.nextInt();
		System.out.println("Enter the breadth of the rectangle");
		int breadth = input.nextInt();
		int area;
		area = length * breadth;
		System.out.println("The area of the rectangle is " + area);
		}
		catch(Exception e) {
			System.out.println("Enter only numbers for length and breadth values");
		}
		finally {
		System.out.println("Thank you!");
		System.out.println("bye bye !");
		System.out.println("Addin webhook trigger in jenkins for testing");
		}
	}

}
