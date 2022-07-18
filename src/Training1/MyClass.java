package Training1;

public class MyClass extends Thread {
	public static void main(String[] args) {
		
		System.out.println("This is for testing github");
		MyClass myObj = new MyClass();
	    myObj.start();
	    System.out.println("This code is outside of the thread");
	  }
	  public void run() {
	    System.out.println("This code is running in a thread");
	  }

	}  

