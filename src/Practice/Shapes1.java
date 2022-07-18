package Practice;

	import java.util.Scanner;
	public class Shapes1
	{
		public void area()
		{
			System.out.println("Area Calculation");
		}
		
	}
	 class Circle extends Shapes1
	{
		public void area()
		{
			double area_cir;
			Scanner input = new Scanner(System.in);
			System.out.println("Enter the radius of the circle");
			int r=input.nextInt();
			area_cir =3.14*r*r;
			System.out.println("The area of the circle is :" + area_cir);
		}
	}
	class Rectangle extends Shapes1
	{
	public void area()
	{
		double area_rect;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle respectively");
		int l= input.nextInt();
		int b = input.nextInt();
		area_rect = l*b;
		System.out.println("The area of the rectangle is :"+ area_rect);
	}
	}
	class Square extends Shapes1

	{
	public void area()
	{
		double area_square;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the side of the square");
		int side= input.nextInt();
		area_square = side*side;
		System.out.println("The area of the square is :"+ area_square);
	}
	}


