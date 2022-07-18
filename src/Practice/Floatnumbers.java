package Practice;

class Floatnumbers extends AbstractAddTwoNumbers
{
	float num1,num2, sum;

	void getdata()
	{
		num1=10.55f;num2=15.75f;
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
