package Practice;

public class Prgreport {
	
	
	public static void main(String[] args) {
		
		System.out.println("\tStudent Progress Record");
		System.out.println("\t***********************");
		String studentName ="Geetha";
		int stuId = 123456;
		int totMarks;
		int math = 84;
		int science = 80;
		int social =65;
		int english = 70;
		totMarks = math+science+social+english;
		System.out.println("Student name  : "+studentName);
		
		System.out.println("Student id    : "+stuId);
		System.out.println("Mathematics   : "+math);
		System.out.println("Science       : "+science);
		System.out.println("Social Studies: "+social);
		System.out.println("English       : "+english);
		System.out.println("-----------------------------");
		System.out.println("Total marks of Geetha : " +totMarks);
		System.out.println("=============================");
		
		

	}

}
