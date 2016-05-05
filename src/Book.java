/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 04/2/16, IS 147-06, Thursdays 7:10-9:45 PM
 */
import java.util.Scanner;


public class Book {
	String author= "Jonson", title= "Cat's Tales";
	int pageNumber= 578;
	double price= 10.15;
	
	public static void main (String[] args) {
		
		String it= "";
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter a string: ");
		it=  input.next();		
		
		System.out.print(changePi(it));
	}
	
	public static String changePi(String str) {
		  String s= "3.14";
		  String thing= "pi";
		  String foo= "";
		  if (str.equals(s))
		    return s;
		    
		  System.out.println(str.replaceFirst(thing, s));
		  foo= str.replaceFirst(thing, s);
		    return foo.substring(0, foo.indexOf('4') + 1) + changePi(foo.substring(foo.indexOf('4') + 1));
		}

	
}
