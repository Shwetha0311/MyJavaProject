package Practice;

public class ConstructorsWithParameters {
int x;
public ConstructorsWithParameters(int y)
{
	x=y;
}
	public static void main(String[] args) {
ConstructorsWithParameters myObject = new ConstructorsWithParameters(8);
System.out.println(myObject.x);
	}

}
