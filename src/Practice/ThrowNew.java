package Practice;

public class ThrowNew {

	public static void main(String[] args) {
int age =5; String string1 ="Welcome",string2 ="Hello";
if(age <18)
{
throw new ArithmeticException("Access denied.Minimum age shoud be 18");
	}
else
	System.out.println("Access Granted!");

}
}
