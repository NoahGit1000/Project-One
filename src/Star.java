/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 03/21/16, IS 147-06, Thursdays 7:10-9:45 PM
 */


public class Star {

	public static void main (String[] args) {
		
		makeStars();
		
	}
	
	public static void makeStars() {

		for (int k= 10; k > 0; k--) {			
			for (int i= 0; i < k; i++) {				
				System.out.print("*");				
			}
			System.out.println();
		}
		
	}
	
}
