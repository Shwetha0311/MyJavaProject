package Practice;

public abstract class AbstractAddTwoNumbers {
abstract void getdata();
abstract void performaddition();
abstract void printdata();
}
class intnumbers extends AbstractAddTwoNumbers
{
	int num1,num2, sum;

void getdata()
{
	num1=10;num2=15;
}
void performaddition()
{
	sum=num1+num2;
}
void printdata()
{
	System.out.println("The two numbers to be added are :"+num1+" and "+num2);
	System.out.println("The result of addition is :"+sum);
}
}
