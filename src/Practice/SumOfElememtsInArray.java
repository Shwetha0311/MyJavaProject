package Practice;

public class SumOfElememtsInArray {

	public static void main(String[] args) {
		int array1[]= {10,20,30,40,50,60,70,80,90,100},i=0;int sumOfElements=0;
	int length = array1.length;
	System.out.println("The length of the array is"+ " "+ length);
	for(i=0;i<length;i++)
	{
	sumOfElements = sumOfElements + array1[i];
	
	}
	
	System.out.println("The sum of elements of the array is " + " " +sumOfElements);

}
}


