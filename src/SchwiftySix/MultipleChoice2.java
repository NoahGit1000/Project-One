

public class MultipleChoice2  {
	
	String answerA, answerB, answerC, answerD;
	
	public MultipleChoice2(String theQuestion, String A, String B,
			String C, String D) { 
		
		super(theQuestion, A);
int score=0;
       String[] multiChoice;
        Scanner input = new Scanner(System.in);

        multiChoice = new String[5];
        multiChoice[0] = "1. What's 2 + 2 = ?\n";
        multiChoice[1] = "2. What's 2 + 3 = ?\n";
        multiChoice[2] = "3. What's 2 + 5 = ?\n";
        multiChoice[3] = "4. What's 2 + 7 = ?\n";
        multiChoice[4] = "5. What's 2 + 10 = ?\n";

        String userInput = multiChoice[0];

            if(userInput==multiChoice[0]){
                System.out.println(multiChoice[0]);
                System.out.println("A. 5");
                System.out.println("B. 3");
                System.out.println("C. 4");
                System.out.println("D. 1");
                System.out.println();
                System.out.println("Your answer (the letter associated with the answer): ");
                String userChoice = input.next();

                switch (userChoice.toUpperCase()) {
                    case "A":
                        userChoice = "5";
                        System.out.println("Incorrect! \n\n");
                        break;
                    case "B":
                        userChoice = "3";
                        System.out.println("Incorrect! \n\n");
                        break;
                    case "C":
                        userChoice = "4";
                        System.out.println("Correct! \n\n");
                        score += 20;
                        break;
                    case "D":
                        userChoice = "1";
                        System.out.println("Incorrect! \n\n");
                        break;
                        
                    default:
                    System.out.println("Invalid entry made, please enter the letter associated with the answer. \n");
                    break;
                    
                }

            }
            String userInput1 = multiChoice[1];
            if(userInput1==multiChoice[1]){
                System.out.println(multiChoice[1]);
                System.out.println("A. 5");
                System.out.println("B. 3");
                System.out.println("C. 4");
                System.out.println("D. 1");
                System.out.println();
                System.out.println("Your answer: ");
                String userChoice = input.next();
                switch (userChoice.toUpperCase()) {
                    case "A":
                        userChoice = "5";
                        System.out.println("Correct! \n\n");
                        score+=20;
                        break;
                    case "B":
                        userChoice = "3";
                        System.out.println("Incorrect! \n\n");
                        break;
                    case "C":
                        userChoice = "4";
                        System.out.println("Incorrect! \n\n");
                       
                        break;
                    case "D":
                        userChoice = "1";
                        System.out.println("Incorrect! \n\n");
                        break;
                    default:
                        System.out.println("Invalid entry made, please enter the letter associated with the answer. \n");
                        break;
                }
                

            }
            String userInput2 = multiChoice[2];
            if(userInput2==multiChoice[2]){
                System.out.println(multiChoice[2]);
                System.out.println("A. 6");
                System.out.println("B. 3");
                System.out.println("C. 10");
                System.out.println("D. 7");
                System.out.println();
                System.out.println("Your answer: ");
                String userChoice = input.next();

                switch (userChoice.toUpperCase()) {
                    case "A":
                        userChoice = "6";
                        System.out.println("Incorrect! \n\n");
                        break;
                    case "B":
                        userChoice = "3";
                        System.out.println("Incorrect! \n\n");
                        break;
                    case "C":
                        userChoice = "10";
                        System.out.println("Incorrect! \n\n");
                       
                        break;
                    case "D":
                        userChoice = "7";
                        System.out.println("Correct! \n\n");
                        score+=20;
                        break;
                    default:
                        System.out.println("Invalid entry made, please enter the letter associated with the answer. \n");
                        break;
                }

            }
            String userInput3 = multiChoice[3];
            if(userInput3==multiChoice[3]){
                System.out.println(multiChoice[3]);
                System.out.println("A. 9");
                System.out.println("B. 12");
                System.out.println("C. 8");
                System.out.println("D. 6");
                System.out.println();
                System.out.println("Your answer: ");
                String userChoice = input.next();

                switch (userChoice.toUpperCase()) {
                    case "A":
                        userChoice = "9";
                        System.out.println("Correct! \n\n");
                        score+=20;
                        break;
                    case "B":
                        userChoice = "12";
                        System.out.println("Incorrect! \n\n");
                        break;
                    case "C":
                        userChoice = "8";
                        System.out.println("Incorrect! \n\n");
                        break;
                    case "D":
                        userChoice = "6";
                        System.out.println("Incorrect! \n\n");
                        break;
                    default:
                        System.out.println("Invalid entry made, please enter the letter associated with the answer. \n");
                        break;
                }

            }
            String userInput4 = multiChoice[4];
            if(userInput4==multiChoice[4]){
                System.out.println(multiChoice[4]);
                System.out.println("A. 13");
                System.out.println("B. 12");
                System.out.println("C. 17");
                System.out.println("D. 10");
                System.out.println();
                System.out.println("Your answer: ");
                String userChoice = input.next();

                switch (userChoice.toUpperCase()) {
                    case "A":
                        userChoice = "13";
                        System.out.println("Incorrect! \n\n");
                        break;
                    case "B":
                        userChoice = "12";
                        System.out.println("Correct! \n\n");
                        score+=20;
                        break;
                    case "C":
                        userChoice = "17";
                        System.out.println("Incorrect! \n\n");
                       
                        break;
                    case "D":
                        userChoice = "10";
                        System.out.println("Incorrect! \n\n");
                        break;
                    default:
                        System.out.println("Invalid entry made, please enter the letter associated with the answer. \n");
                        break;
                }

            }
            System.out.println("Score: " +score);
            if (score<=59) {

                System.out.print("You did not score high enough, please try again");

                //return to question 1 && set score back to 0

            }else if (score>=60 && score<=69){

                System.out.println("You passed, but just barely.");

                System.exit(0);

            }else if(score>=70 && score<=79){

                System.out.println("You passed with an average score.");

                System.exit(0);

            }else if(score>=80 && score<=89){

                System.out.println("You did very well, but can you make it to an A?");

                System.exit(0);

            }else if(score>=90 && score<=100){

                System.out.println("Great job, you really know your stuff.");

                System.exit(0);

            }
            }

				

	
	}
	    
	
}