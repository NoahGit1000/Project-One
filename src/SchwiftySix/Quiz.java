package SchwiftySix;


import java.util.Scanner;


public class Quiz {

	private static Scanner input;
	private static String personName;
	private static boolean correctOrNot;
	private static String whatToDo;
	
    public static void main(String[] args) {   	
    	
    	Quiz theQuiz = new Quiz();
    	input = new Scanner(System.in);
    	
    	System.out.println("Welcome to the Schwifty Six Quiz!\n");
    	System.out.println("-------------------");
    	theQuiz.getName();   	
    	System.out.println("Hello " + personName + "! Let's start the quiz!\n");
    	
    	Question[] theQuestions = new Question[10];
    	int amountOfIncorrectAnswers= 0;
    	int totalAnswers= theQuestions.length;
    	
    	theQuestions[0]= new SingleChoice("What's the last name of the current president of the USA?", "Obama"); 	
    	theQuestions[1]= new MultipleChoice("What's 2 + 1 = ?", "A", "3", "4", "5", "1"); /*Question sentence, correct answer, choiceA, chocieB */
    	theQuestions[2]= new SingleChoice("How many states are in the USA?", "Fifty");
    	theQuestions[3]= new MultipleChoice("What's 2 + 3 = ?", "D", "1", "3", "4", "5");
    	theQuestions[4]= new SingleChoice("What's the capital of the Maryland?", "Annapolis");
    	theQuestions[5]= new MultipleChoice("What's 2 + 5 = ?", "B", "6", "7", "10", "3");
    	theQuestions[6]= new SingleChoice("How many stars are in US flag?", "Fifty");
    	theQuestions[7]= new MultipleChoice("What's 2 + 7 = ?", "A", "9", "12", "8", "6");
    	theQuestions[8]= new SingleChoice("What is the biggest country in the world in terms of area?", "Russia");
    	theQuestions[9]= new MultipleChoice("What's 2 + 10 = ?", "C", "13", "18", "12", "10");
    	
    	for (int i= 0; i < theQuestions.length; i++) {
    		System.out.print("Question number " + (i+1) + ": ");
    		correctOrNot= theQuestions[i].ask();
    		
    		if (correctOrNot != true) {
    			amountOfIncorrectAnswers++;
    		}
    		
    	}
    	
    	
    	Grade theGrade= new Grade(amountOfIncorrectAnswers, totalAnswers);
    	
    	System.out.println("\nQuiz is over! " + theGrade.commentGrade() + 
    			" You got " + (totalAnswers - amountOfIncorrectAnswers) + " out of " +
    			totalAnswers + " right.\n");
    	
    	System.out.print("Would you like your grade in percentage or in letter format?\n " +
    			"(Type the character symbol % for percentage or the word 'letter' for letter): ");
    	whatToDo= input.next();
    	
    	if (whatToDo.equalsIgnoreCase(""+'%')) {
    		char[] a= whatToDo.toCharArray();
    		System.out.println();
    		System.out.println("Your grade in percentage: " + theGrade.computeGrade(a[0]));//The character version of compueteGrade()
    		
    	}	else if (whatToDo.equalsIgnoreCase("letter")) {
    		System.out.println();
    		System.out.println("Your grade in letter: " + theGrade.computeGrade(whatToDo)); //The letter version of computeGrade()
    		
    	} 	else {
    		System.out.println();
    		System.out.println("Your grade in letter: " + theGrade.computeGrade(whatToDo)); //Default
    	}
    	
    }
    
    	public void getName() {
    		input = new Scanner(System.in);
    		System.out.print("What's your name? ");
    		personName= input.next();
    	}
    
}   