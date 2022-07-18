package Practice;

public class Methods {
	
	/*Creating a simple method
	 * to print multiplication table
	 */
	
	static void Multitable(int table)
	{
		for(int i=1;i<=10;i++)
			System.out.println(table + "X"+ i + "=" + table*i);
	}

	public static void main(String[] args) {
		 
		Multitable(8);
		System.out.println("I created a java program using methods!");
	}

}
