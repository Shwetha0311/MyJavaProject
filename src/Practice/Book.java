package Practice;


public abstract class Book {
	
String colour="Red";int length =10;
public abstract void read();
}

class book1 extends Book
{
	public void read()
	{
		System.out.println("Im reading a book");
		}
String book_name="Programming";int no_of_pages=100;
}

