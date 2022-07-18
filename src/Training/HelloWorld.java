package Training;

public class HelloWorld {

	public static void main(String[] args) {
		
		String name = "Shwetha";
		Integer salary = 4500;
		int incen = 2300;
		int tax = 356;
		int totSalary = salary + incen - tax;
		System.out.println("Hi this is Shwetha!");
		System.out.println("Employee Details");
		System.out.println("==================\n");
		
		System.out.println("Employee Name : " +name);
		System.out.println("Salary        : " +salary);
		System.out.println("Incentive     : " +incen);
		System.out.println("State Tax     : " +tax);
		System.out.println("Total Salary  : " +totSalary);
		
		
		
	}
}
