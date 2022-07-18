package Practice;

public class SwitchStatement {

	public static void main(String[] args) {
		char colour = 'r';
		switch(colour)
		{
		case 'r':
			System.out.println("The colour is red");
			break;
		case 'b':
			System.out.println("The colour is blue");
			break;
		case 'g':
			System.out.println("The colour is green");
			break;
		case 'w' :
			System.out.println("The colour is white");
			break;
		default: 
			System.out.println("Other colours");
		}

	}

}
