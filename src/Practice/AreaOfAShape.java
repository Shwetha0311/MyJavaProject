package Practice;

import java.util.Scanner;

public class AreaOfAShape {

	public static void main(String[] args) {
		// Creating Objects
		
Shapes object1 = new Shapes();
//Getting input from the user
System.out.println("Enter the shape for which you want to find the area for.");
System.out.println("Choose a number from the following options");
System.out.println("1.Circle 2. Rectangle 3. Square");
Scanner input = new Scanner(System.in);
int option = input.nextInt();
//Performing appropriate functions
if(option == 1)
	object1.area_cir();
else if(option==2)
	object1.area_rect();
else if(option==3)
	object1.area_square();
else
	System.out.println("Enter a valid option");

	}

}
