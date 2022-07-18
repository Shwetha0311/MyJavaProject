package Practice;

public class Encapsulation {
	private int num1,num2,num3;
	private String empname, name_company;
	
	int getNum1()
	{
		return num1;
	}
int getNum2()
{
	return num2;
}

int getNum3()
{
	return num3;
}
String getEmpname()
{
	return empname;
}
String getName_company()
{
	return name_company;
}
int setNum1()
{
	this.num1=5;
	return num1;
}
int setNum2()
{
	this.num2=10;
	return num2;
}
int setNum3()
{
	this.num3=15;
	return num3;
	
}
String setEmpname()
{
	this.empname= "John";
	return empname;
}
String setName_company()
{
	this.empname="ABC company";
	return name_company;
}
}
