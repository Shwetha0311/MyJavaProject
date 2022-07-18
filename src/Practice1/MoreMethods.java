package Practice1;

import java.util.Scanner;

public class MoreMethods {
	
	static void add(int num1, int num2)
	{
		int res_add;
		res_add = num1+num2;
		System.out.println("The result of addition is: "+ res_add);
	}
	
	static void subtract(int num1,int num2)
	{
		int res_sub;
		res_sub=num1-num2;
		System.out.println("The result of subtraction is : "+res_sub);
	}

	static void multiply(int num1,int num2)
	{
		int res_mult;
		res_mult = num1*num2;
		System.out.println("The product of multiplication is :"+ res_mult);
	}
	static void divide(int num1,int num2)
	{
		int res_div;
		res_div = num1/num2;
		System.out.println("The quotient of division is :"+ res_div);
	}
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the first number :");
		int num1 = input.nextInt();
		System.out.println("Enter the second number");
		int num2 = input.nextInt();
		System.out.println("What do you want to do with the following? Choose amomg the given options:");
		System.out.println("1.Add 2.Subtract 3.Multiply 4.Divide");
		Scanner keyin = new Scanner(System.in);
		int opt = keyin.nextInt();
		if(opt == 1) 
			add(num1,num2);
		else if(opt == 2)
		subtract(num1,num2);
		else if(opt == 3) 		
			multiply(num1,num2);
		else if(opt == 4)
			divide(num1,num2);	
		else
			System.out.println("Please enter a valid option");
	}

}
