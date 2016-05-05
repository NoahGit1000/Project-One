package SchwiftySix;
import java.util.Scanner;

public class MultipleChoice extends Question {
	
	String answerA, answerB, answerC, answerD;
	
	
	/*
	 * In the constructor, get the sentence and the choices. Create a method called ask that 'asks' (prints out)
	 * the sentence, takes in the user's answer and returns whether it's right or not
	 * */
	public MultipleChoice(String theQuestion, String letterOfAnswer, String A, String B,
			String C, String D) { 
		
		super(theQuestion, letterOfAnswer);
		
		answerA= A;
		answerB= B;
		answerC= C; 
		answerD= D;	
		
	}
	    
	
	public boolean ask() {
		
		String userAnswer;
		Boolean rightOrWrong= false;
        Scanner input = new Scanner(System.in);
		
		System.out.println(super.sentence);
		System.out.println("A. " + answerA);
		System.out.println("B. " + answerB);
		System.out.println("C. " + answerC);
		System.out.println("D. " + answerD);
		System.out.print("Enter answer here (enter the LETTER associated with it): ");
		userAnswer= input.next();
		
		switch (userAnswer.toUpperCase()) {
        case "A":
        	
        	if (userAnswer.equals(super.answer)) {
        		System.out.println("\n Correct! \n");
        		rightOrWrong= true;
        	} else {
        		System.out.println("\n Incorrect! \n");
        		rightOrWrong= false;
        	}
            break;
            
            
        case "B":
        	
        	if (userAnswer.equals(super.answer)) {
        		System.out.println("\n Correct! \n");
        		rightOrWrong= true;
        	} else {
        		System.out.println("\n Incorrect! \n");
        		rightOrWrong= false;
        	}
            break;
            
            
        case "C":
        	
        	if (userAnswer.equals(super.answer)) {
        		System.out.println("\n Correct! \n");
        		rightOrWrong= true;
        	} else {
        		System.out.println("\n Incorrect! \n");
        		rightOrWrong= false;
        	}
            break;
            
            
        case "D":
        	
        	if (userAnswer.equals(super.answer)) {
        		System.out.println("\n Correct! \n");
        		rightOrWrong= true;
        	} else {
        		System.out.println("\n Incorrect! \n");
        		rightOrWrong= false;
        	}
            break;
            
            
        default:
            System.out.println("\n*Invalid entry made, please redo the question.*\n");
            this.ask(); //Our implementation of the recursion concept
		
		}
	
		return rightOrWrong;
	
	}
	
}