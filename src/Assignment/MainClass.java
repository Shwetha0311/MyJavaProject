package Assignment;

public class MainClass {

	public static void main(String[] args) {
		subclass myObj=new subclass();
		myObj.add();
		System.out.println("I created a program using Inheritance");
		myObj.setName("John");
		myObj.setAge(30);
		System.out.println(myObj.getName());
		System.out.println(myObj.getAge());
		
	}
}

