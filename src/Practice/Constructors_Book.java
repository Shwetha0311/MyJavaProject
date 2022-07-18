package Practice;

public class Constructors_Book {
	int noOfCopies;

	public Constructors_Book()
	{
noOfCopies=1000;
	}
	public static void main(String[] args) {
Constructors_Book object1= new Constructors_Book();
System.out.println("The initial no of copies is:" + object1.noOfCopies);
object1.noOfCopies=2000;
System.out.println("The number of copies has increased to :" +object1.noOfCopies);
	}

}
