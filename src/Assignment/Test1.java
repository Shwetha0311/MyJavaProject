package Assignment;

public class Test1 {
int num1=5,sum;
private String name ;private int age;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

{
	
}
}
class subclass extends Test1
{
	int num2=10;
	public void add()
	{
		sum = num1+num2;
		System.out.println("The sum of two numbers is :"+ sum);
	}
}
