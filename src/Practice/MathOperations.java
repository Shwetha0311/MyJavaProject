package Practice;

import java.util.Scanner;

public interface MathOperations {
public void getdata(int num1,int num2);
public void printdata();
}
class subclass implements MathOperations
{
	int result;int num1,num2;
	public int opt1;
	public void getdata(int x,int y)
	{
		System.out.println("Choose the operation you want to perform");
		System.out.println("1.Addition 2. Subtraction 3.Multiplication 4.Division");
		Scanner option = new Scanner(System.in);
		opt1 = option.nextInt();
System.out.println("You have entered option "+ opt1);
num1=x;num2=y;
System.out.println(num1);
System.out.println(num2);
}
	public void printdata()
	{
		System.out.println("The two numbers are:"+num1+num2);
	}
}