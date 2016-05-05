package SchwiftySix;

public abstract class Question {
	
	String sentence;
	String answer;
	
	public Question (String theQuestion, String theAnswer) {
		
				sentence= theQuestion;
				answer= theAnswer;
				
	}
	
	public abstract boolean ask();
		
	
	
}
