package Training;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
     
        //System.out.println("Sum = " + sum);

        Double num, sum = 0.0;
        // creates an object of Scanner class
        Scanner input = new Scanner(System.in);

        do {

            // takes input from the user
            System.out.print("Enter a number: ");
            num = input.nextDouble();
            sum += num;
        } while (num != 0.0);  // test expression
	   
        System.out.println("Sum = " + sum);


	}

}
