package Practice;

import java.util.Scanner;

public class UserInputeg3 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
System.out.println(" Enter the student name");
String name = input.nextLine();
System.out.println("Enter the student ID no:");
int idno = input.nextInt();
System.out.println("Enter the percentage of marks");
float marks = input.nextFloat();
System.out.println(name + " has scored"+ marks +" marks.His ID number is "+ idno+".");
	}
}
