package Practice;


class Stdetails {

	int grade=1;String school_name="ABC school",name="Ravi";int std_id=12345;
	
}
	class moreStDetails extends Stdetails
	{
		int avg=85;
		public void printdetails()
		{
			System.out.println("School" + school_name);
			System.out.println("Name "+ name);
			System.out.println("Grade"+ grade);
			System.out.println("Student ID"+ std_id);
		}
	public void printmoredetails()
	
	{
		System.out.println("Average :"+avg);
	}
	}
