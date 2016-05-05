/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 03/21/16, IS 147-06, Thursdays 7:10-9:45 PM
 */


import java.util.Scanner;

public class TestScores {
	
	public static void main(String[] args) {
		
		getTestScores();
		
	}
	
	
	public static void getTestScores() {
		
		int sum= 0, average;
		boolean running= true;
		String it;
		
		int[] tests= new int[3];
		
		Scanner input= new Scanner(System.in);
		
		while (running) {
			System.out.print("Please input test score one: ");
			tests[0]= input.nextInt();
			System.out.print("Please input test score two: ");
			tests[1]= input.nextInt();
			System.out.print("Please input test score three: ");
			tests[2]= input.nextInt();
		
			for (int a : tests) {
				sum+= a;
			}
		
			average= sum / tests.length;

			System.out.println("The average of your tests is: " + average);
			System.out.print("Would you like to continue? (Type \"Q\" to quit or anything else to continue.)");
			it= input.next();
			
			if (it.equals("Q")) {
			running= false;
			}
			
			System.out.println("\n");
			sum= 0;
			
		}
		
	}
	
	
}
