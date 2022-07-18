package Practice;

import java.util.Scanner;

public class UserInput {
	
	public static void main(String[] args) {	
	System.out.println("We are calculating the area of a rectange");
	System.out.println("Enter the length of the rectangle");
	Scanner input = new Scanner(System.in);
	int length = input.nextInt();
	System.out.println("Enter the breadth of the rectangle");
	int breadth = input.nextInt();
	int area;
	area = length * breadth;
	System.out.println("The area of the rectangle is " + area);
	}

}
