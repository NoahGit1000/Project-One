/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 04/2/16, IS 147-06, Thursdays 7:10-9:45 PM
 */

public class Methods {
	static int number1= 7;
	static int number2= 4;
	static int result;	
	
	public static void main (String[] args) {
		System.out.println("Calling the add() method. Using with the first number being 7 and the second being 4");
		add(number1,number2);
		
		System.out.println("Calling the subtraction() method. Using with the first number being 7 and the second being 4");
		subtraction(number1,number2);
		
		System.out.println("Calling the multiplication() method. Using with the first number being 7 and the second being 4");
		multiplication(number1,number2);
		
		System.out.println("Calling the division() method. Using with the first number being 7 and the second being 4");
		division(number1,number2);
	}
	
	
	
	public static void add (int num1, int num2) {
		result= num1 + num2;
		
		System.out.println("the result is: " + result + "\n");
		
		result= 0;
	}
	
	public static void subtraction (int num1, int num2) {
		result= num1 - num2;
		
		System.out.println("the result is: " + result + "\n");
		
		result= 0;
	}
	
	public static void multiplication (int num1, int num2) {
		result= num1 * num2;
	
		System.out.println("the result is: " + result + "\n");

		result= 0;
	}

	public static void division (int num1, int num2) {
		result= num1 / num2;
	
		System.out.println("the result is: " + result + "\n");

		result= 0;
	}

}
