package SchwiftySix;

import java.util.Scanner;

public class SingleChoice extends Question {
	
	public SingleChoice(String theQuestion, String theCorrectAnswer) { 
		
		super(theQuestion, theCorrectAnswer);
	
	}
	
	public boolean ask() {
		
		String userAnswer;
		Boolean rightOrWrong= false;
        Scanner input = new Scanner(System.in);
        
        System.out.println(super.sentence);
		System.out.print("TYPE OUT the answer and ONLY the answer; no spaces before or after (only in between if necessary): ");
		userAnswer= input.next();
		
		
		if (userAnswer.equalsIgnoreCase(super.answer)) {
			System.out.println("\n Correct! \n");
			rightOrWrong= true;
		} else {
			System.out.println("\n Incorrect! \n");
			rightOrWrong= false;
		}
		
		return rightOrWrong;
	}
	
}
