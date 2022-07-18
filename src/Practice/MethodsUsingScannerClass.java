package Practice;

import java.util.Scanner;

public class MethodsUsingScannerClass
{
	
	static void Multitable(int table)
	{
	int i=1;
	for(i=1;i<=10;i++)
	System.out.println(table + "X"+ i+ "=" +table*i);
	}
public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in); 
			System.out.println("Enter the table which you want to print:");
			int table=input.nextInt();
			System.out.println(table + " Mutliplication Table");
			Multitable(table);
	}

}
