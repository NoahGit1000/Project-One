/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 02/18/16, IS 147-06, Thursdays 7:10-9:45 PM
 */

import java.util.Scanner;

public class Lab2 {
	
	public static void main (String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		String monthNumber;
		
		System.out.print("Please input the month number. If month number is 6, example, input 5: ");
		monthNumber= input.next();
		System.out.print("Using the switch statement: ");
		
		switch (monthNumber) {			
			case "0": System.out.println("January"); break;
			case "1": System.out.println("February"); break;
			case "2": System.out.println("March"); break;
			case "3": System.out.println("April"); break;
			case "4": System.out.println("May"); break;
			case "5": System.out.println("June"); break;
			case "6": System.out.println("July"); break;
			case "7": System.out.println("August"); break;
			case "8": System.out.println("September"); break;
			case "9": System.out.println("October"); break;
			case "10": System.out.println("November"); break;
			case "11": System.out.println("December"); break;
			default: System.out.println("Not a valid month."); break;
		}
			
		
		System.out.print("Using if-else conditionals: ");
		
		if (monthNumber.equals("0")) {
			System.out.println("January");
		} else if (monthNumber.equals("1")) {
			System.out.println("February");
		} else if (monthNumber.equals("2")) {
			System.out.println("March");
		} else if (monthNumber.equals("3")) {
			System.out.println("April");
		} else if (monthNumber.equals("4")) {
			System.out.println("May");
		} else if (monthNumber.equals("5")) {
			System.out.println("June");
		} else if (monthNumber.equals("6")) {
			System.out.println("July");
		} else if (monthNumber.equals("7")) {
			System.out.println("August");
		} else if (monthNumber.equals("8")) {
			System.out.println("September");
		} else if (monthNumber.equals("9")) {
			System.out.println("October");
		} else if (monthNumber.equals("10")) {
			System.out.println("November");
		} else if (monthNumber.equals("11")) {
			System.out.println("December");
		} else {
			System.out.println("Not a valid month.");
		}
		
	}

}
