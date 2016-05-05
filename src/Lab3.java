/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 03/5/16, IS 147-06, Thursdays 7:10-9:45 PM
 */

import java.util.Scanner;

public class Lab3 {
	
	public static void main (String[] args) {
		
		String firstName, lastName, tempOne, tempTwo, firstChar, lastThreeChars;
		String thePassword;
		int randNum= 10 + (int) (Math.random() * 99);
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Please enter your first name: ");
		firstName= input.next();
		System.out.print("Please enter your last name: ");
		lastName= input.next();
		
		tempOne= "" + firstName.charAt(0);
		firstChar= tempOne.toUpperCase();
		
		tempTwo= "" + lastName.substring(lastName.length() - 3, lastName.length());
		lastThreeChars= tempTwo.toLowerCase();
		
		thePassword= firstChar + randNum + lastThreeChars;
		
		System.out.print(firstName + " " + lastName+ "'s password is: \"" + thePassword + "\"");
		
	}
	
}
