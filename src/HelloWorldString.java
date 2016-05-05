/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 03/23/16, IS 147-06, Thursdays 7:10-9:45 PM
 */


public class HelloWorldString {

	public static void main(String[] args) {
		
		String stringOne = "Hello World";
		
		System.out.println("Length of string 'stringOne' is: " + stringOne.length());
		
		System.out.println("A substring of string 'stringOne' (starting from index 3) is: " + stringOne.substring(3));
		
		System.out.println("The index of a particular character ('W' for example) is: " + stringOne.indexOf("W"));
		
		System.out.println("The character at index 8, for example, is: " + stringOne.charAt(8));
		
		System.out.println("The string 'stringOne' changed to all uppercase is: " + stringOne.toUpperCase());		
		System.out.println();
		
		
		stringOne = "Hello:and:World";
		System.out.println("stringOne is now: " + stringOne);
		
		System.out.println("The following is the string 'stringOne' split up around the " + 
		"regex (regular expression) ':' (colon) is: ");
		
		String[] a = stringOne.split(":");
		
		for (String l : a) {
			System.out.println(l);
		}		
		
		
		System.out.println("\nWhen we check to see if the string \"dog\" is in stringOne, we're" + 
		" returned the Boolen variable: " + stringOne.contains("dog"));
		
		
		String stringTwo= stringOne.toUpperCase();
		
		System.out.println("\nWhen we check if stringOne is equal to stringTwo (an all upper case" + 
		" version of stringOne), we're returned the Boolean variable: " + stringOne.equalsIgnoreCase(stringTwo));
	}

}
