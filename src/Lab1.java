

/**
 * Corrected by Noah Phillip Austin Owens, nowens1@umbc.edu
 * 2/16/16, IS 147-06, Thursdays 7:10-9:45 PM
 * Created by Shiva on 2/10/2016.
 */

import java.util.Scanner;

public class Lab1 {
   
    public static void main(String[] args)
    {
    	Scanner input = new Scanner(System.in);
    	
    	final double tax = .05; 
    	int age, hours, payRate, grossPay;
    	double netPay;
    	String name;
    	
        System.out.println("This is my first message");
        System.out.println("This is my second message");
        System.out.println("This is my third message");
    
        System.out.println();
        
        System.out.print("Please enter your name: ");
        name= input.next();
        System.out.print("Please enter age: ");
        age= input.nextInt();
        System.out.print("Please enter hours: ");
        hours= input.nextInt();
        System.out.print("Please enter pay rate: ");
        payRate= input.nextInt();
        
        grossPay= payRate * hours;
        netPay= grossPay - (grossPay * tax);
        
        System.out.println("Here's your name: " + name + "  Age: " + age + "  And net pay earned: " + netPay);
        System.out.println("The tax rate is: " + tax + " out of 1.0");
    }
}