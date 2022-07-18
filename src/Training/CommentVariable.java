package Training;

public class CommentVariable {

	public static void main(String[] args) {
		// This is my first comment
		
		
		System.out.println("Welcome to the world of java"); //display statement for the first time
		System.out.println("Employee Details");
		int empid = 123456;
		String name = "Shwetha";
		String lName = "Subramanian";
		String desig = "Java Developer";
		int age = 34;
		String emailadd="shwetha.ch2019@gmail.com";
		float salary = 5000.00f;
		float tax = 350.25f;
		float medins=280.35f;
		float stax=420.50f;
		float bonus = 1200.75f;
		float totSalary = salary + bonus - tax-stax-medins;
		System.out.println("Employee ID        : " +empid );
		System.out.println("Employee Name      : " +name + " "+lName);
		System.out.println("Age                : " +age);
		System.out.println("Designation        : " +desig);
		System.out.println("Email Address      : " +emailadd);
		System.out.println("Salary             : " +salary);
		System.out.println("Incentive          : " +bonus);
		System.out.println("Federal tax        : " +tax);
		System.out.println("Medical Insuarance : " +medins);
		System.out.println("State tax          : " +stax);
		System.out.println("Net Salary         : " +totSalary);
		
		int x = 40;
		int y = 30;
		short empId= 135;
		String a = "50";
		String b = "60";
		System.out.println("====================================================");
		System.out.println(x + y );
		System.out.println(a + b);
		System.out.println(x + a);
		System.out.println(y + b);
		System.out.println(50 < 60);
		System.out.println(empId);
		
	}
	
	

}
