/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 04/21/16, IS 147-06, Thursdays 7:10-9:45 PM
 */

public class Lab7 {

	public static void main (String[] args) {
		
		String[][] twoDimension= {{"Course number |", "Course name |", "Room"},
								  {"IS 147:", "Programming in Java I", "Room 100"},
								  {"IS 247:", "Programming Java II", "Room 200"},
								  {"IS 410:", "Database Programming I", "Room 300"},
								  {"IS 420:", "Database Programming II", "Room 400"}};
		
		for (int i= 0; i < twoDimension.length; i++)	{
			for (int j= 0; j < twoDimension[j].length; j++)
				System.out.print(" " + twoDimension[i][j]);
			System.out.print("\n --------------------------------------- \n");
		}
			
				
	}
	
}
