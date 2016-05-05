/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 04/21/16, IS 147-06, Thursdays 7:10-9:45 PM
 */
import java.util.Scanner;


public class Lab6 {

	public static void main(String[] args) {
		int k= 0, j= 0, sum= 0;
		int[] array = new int[7];
		
		Scanner input = new Scanner (System.in);
		
		while (k != 7) {
			System.out.print("Please input store sales for Day " + (k+1) + " (Do not use '$' sign): ");
			array[k]= input.nextInt();
			k++;
		}

		System.out.println("\nSales Data for Seven Days");
		System.out.println("--------------------------");
		
		while (j != 7) {
			System.out.println("Day " + (j+1) + " Sales: $" + array[j]);		
			j++;
		}
		
		for (int a : array) 
			sum+= a;
		
		System.out.print("\nTotal sales: $" + sum);
	}	
		
}
