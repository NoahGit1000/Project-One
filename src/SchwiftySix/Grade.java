package SchwiftySix;
public class Grade {

private int incorrectAnswers, totalAnswers, score;

   public Grade (int num1, int num2) {
	   incorrectAnswers= num1;
	   totalAnswers= num2;	  
   }

	public String commentGrade() {
	    String [] comments = new String [5];
	    comments[0] = "You did not score high enough, please try again";
	    comments[1] = "You passed, but just barely.";
	    comments[2] = "You did very well, but can you make it to an A?";
	    comments[3] = "Great job, you really know your stuff";
	    comments[4] = "Perfect Score!";
	    
	    score= (totalAnswers - incorrectAnswers) * 10;
	    
	    if (score<=59) {	    	
	        return comments[0].toLowerCase();
	        
	    } else if (score>=60 && score<=69){	    	
	    	return comments[1].toLowerCase();
	    	
	    } else if(score>=70 && score<=79){	        	
	        return comments[2].toLowerCase();

	    } else if(score>=80 && score<=89){	        	
	        return comments[3].toLowerCase();

	    } else {	    	
	        return comments[4].toLowerCase();
	        
	        }
	    
	    }

	public String computeGrade(char c) {
		char holdIt= c;
		return " " + score + "%";
	}
	
	public String computeGrade(String s) {
		String holdIt= s;
		
		if (score<=59) {	    	
	        return "E";
	        
	    } else if (score>=60 && score<=69){	    	
	    	return "D";
	    	
	    } else if(score>=70 && score<=79){	        	
	        return "C";

	    } else if(score>=80 && score<=89){	        	
	        return "B";

	    } else {	    	
	        return "A";
	        
	        }
		
	}
	
}