package Practice;

public class TernaryOperator {

	public static void main(String[] args) {
		/*Practice with ternary operator
		 * short hand if else to determine
		 * odd and even numbers
		 */
		int number=57;
	String result =(number%2==0)?"EVEN NUMBER" :"ODD NUMBER";
	System.out.println(result);
	//Another example of ternary operator with integer values
	String string1 = "One";
	int number1 = (string1=="One")? 1:2;
	System.out.println(number1);
	//Another example
	int number2=15,number3=20;
	String isTheConditionTrue =(number2>number3)? "True":"False";
	System.out.println(isTheConditionTrue);
	

	}

}
