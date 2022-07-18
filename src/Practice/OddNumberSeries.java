package Practice;

import java.util.Scanner;

public class OddNumberSeries {
	
	static void mthd_oddseries(int lmt)
	{
		for(int i=1;i<=lmt;i=i+2)
			System.out.println(i);
	}

	public static void main(String[] args) {
System.out.println("Enter the limit till which the odd numbers has to be printed :");
Scanner input = new Scanner(System.in);
int lmt = input.nextInt();
mthd_oddseries(lmt);

}

}
