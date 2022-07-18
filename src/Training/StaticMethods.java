package Training;

public class StaticMethods {
	static void myMethod() {
		System.out.println("This is my first method");	
		System.out.println(40 * 60);
		System.out.println("Hurray ");
	}

	static void nameMethod(String fName, int age ) {
		System.out.println("Miss."  +fName + " Subramanian");
		System.out.println("Age is " +age);
	}
	public static void main(String[] args) {
		nameMethod("Shwetha" , 30);
		nameMethod("Sneha", 20);
		myMethod();
		
	}

}
