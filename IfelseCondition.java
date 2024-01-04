package sample.java;
import java.util.Scanner;

public class IfelseCondition {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("what is your online assessement status ");
		
		int i = -20;
	    if( i > 0 ) {
	    	System.out.println("the given number negative number");
	    }
	    else {
	    	System.out.println("the given number is positive number");
	    }
	    
	    nextif();

	}
	
	public static void nextif() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("what is your online assessement status ");

		String ExamStatus = scanner.nextLine();
//		String ExamStatus = "pass";
		if( ExamStatus == "pass") {
			System.out.println("wiat for the exam result");
			
			String round1status ="pass";
			if( round1status == "pass") {
				System.out.println("1round exam status is pass, I will go to 2 round ");
			}
			String Round2Status = "pass";
			if(Round2Status == "Pass") {
				System.out.println("Are you 2nd round interviwe are pass");
			}
			else {
				System.out.println(" you can go to home");
			}
		}
		else {
			System.out.println("you can go to home");
		}
	}

}
