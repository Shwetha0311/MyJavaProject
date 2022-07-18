package Practice;

import java.util.Scanner;

public class InterfacePractice {

	public static void main(String[] args)
	{
		
subclass object1 = new subclass();

object1.getdata(4,6);

if(object1.opt1==1)
{
object1.result =object1.num1+object1.num2;
}
else if(object1.opt1==2)
{
	object1.result =object1.num1-object1.num2;
}
else if(object1.opt1==3)
{
	object1.result=object1.num1*object1.num2;
}
else if(object1.opt1==4)
{
	object1.result = object1.num1/object1.num2;
}
/*else
	System.out.println("Enter a valid option");*/
System.out.println("The result is "+ object1.result);
}

}
