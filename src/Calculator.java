/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 03/23/16, IS 147-06, Thursdays 7:10-9:45 PM
 */
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		int numberOne, numberTwo, operation= 1;
		
		Scanner input = new Scanner(System.in);
		
		while (operation != 0) {
			
			System.out.println("Math Calculator program \nEnter '0' to quit," + 
					" '1' to add, '2' to subtract, '3' to multiply, and '4' to divide.");
					
					System.out.print("\nPlease enter your first number: ");
					numberOne= input.nextInt();
					System.out.print("Please enter your second number: ");
					numberTwo= input.nextInt();
					System.out.print("What mathematical operation would you like to do?" +
					" (Enter '0' to quit or Reference the numbered instruction menu): ");
					operation= input.nextInt();
					
					if (operation == 1)
						System.out.println("Your result is: " + Math.addExact(numberOne, numberTwo));
					
					else if (operation == 2)
						System.out.println("Your result is: " + Math.subtractExact(numberOne, numberTwo));
					
					else if (operation == 3)
						System.out.println("Your result is: " + Math.multiplyExact(numberOne, numberTwo));
					
					else if (operation == 4)
						System.out.println("Your result is: " + Math.floorDiv(numberOne, numberTwo));
					
					else if (operation == 0)
						System.out.println("Alright, just type in '0' again at the next line.");
						
					else
						System.out.println("Not an instruction!\n" + operation);
					
					System.out.print("Would you like to quit? (Enter '0' to quit, any other number to continue): ");
					operation= input.nextInt();
					
					if (operation == 0)
						System.out.print("\nGoodbye!");
					
					else
						System.out.print("\n");
						
		}
		
	}

}
