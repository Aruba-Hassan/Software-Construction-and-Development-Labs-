package mark.sheet;
import java.util.*;
public class StudentMarkSheet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Input student name.
		System.out.println("Enter Student Name: ");
		String student_name = input.nextLine();
		// Input total marks.
		System.out.println("Enter Total Marks: ");
		int total_marks = input.nextInt();
		// Input obtained marks.
		System.out.println("Enter Obtained Marks: ");
		float obtained_marks = input.nextFloat();
		float percentage = (obtained_marks/total_marks)*100;
		String grade;
		double gpa;
		if(percentage >= 90) {
			grade = "A-one";
			gpa = 3.99;
		}else if(percentage >= 80) {
			grade = "A";
			gpa = 3.70;
		}else if(percentage >= 70) {
			grade = "B";
			gpa = 3.60;
		}else if(percentage >= 60) {
			grade = "C";
			gpa = 3.40;
		}else if(percentage >= 50) {
			grade = "D";
			gpa = 2.90;
		}else if(percentage >= 40){
			grade = "E";
			gpa = 2.40;
		}else {
			grade = "F";
			gpa = 2.33;	}
		System.out.println("   ");  
		System.out.println("        'STUDENT MARKSHEET'        ");
		System.out.println("   ");
		System.out.println("Student Name: " + student_name);
		System.out.println("Total Marks: " + total_marks);
		System.out.println("Obtained Marks: " + obtained_marks);
		System.out.println("Student's Grade: " + grade);
		System.out.println("Student's GPA: " + gpa);	
	}
}
