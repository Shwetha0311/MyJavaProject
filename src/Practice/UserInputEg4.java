package Practice;

import java.util.Scanner;

public class UserInputEg4 {
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the student name :");
		String st_name = input.nextLine();
		System.out.println("Enter the marks scored in English :");
		int eng_marks= input.nextInt();
		System.out.println("Enter the marks scored in Math :");
		int math_marks = input.nextInt();
		System.out.println("Enter the marks scored in Social :");
		int social_marks= input.nextInt();
		System.out.println("Enter the marks scored in Language :");
		int lang_marks = input.nextInt();
		System.out.println("Enter the marks scored in Science :");
		int sci_marks=input.nextInt();
		System.out.println(st_name + "'s" + " marks is as follows");
		int tot_marks, avg;
		tot_marks = (eng_marks + math_marks + social_marks+lang_marks+sci_marks);
		avg = tot_marks/5;
		System.out.println("Total Marks :" +tot_marks);
		System.out.println("Average : " + avg);
				}

}
