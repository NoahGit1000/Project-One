/*
 * Noah Phillip Austin Owens, nowens1@umbc.edu
 * 02/26/16, IS 147-06, Thursdays 7:10-9:45 PM
 */

public class HomeworkOne {

    public static void main(String[]args){

        //HW1 part1 sample
        //arithmetical
        // '+' operator
        String myfirstString= "IS";
        String mysecondString="147";
        String plusOperator=myfirstString+mysecondString;
        System.out.println ("Using + operator " + plusOperator + "\n");

        // '-' operator
        int i= 10, j= 20;       
        int result= i - j;     
        System.out.println("i: " + i + " j: " + j);
        System.out.println("The result of i - j (minus sign): " + result + "\n");

        // '*' operator
        result= i * j;       
        System.out.println("The result of i * j (multiplication sign): " + result + "\n");
        
        // '/' operator
        result= i / j;       
        System.out.println("The result of i / j (division sign): " + result + "\n");
        
        // '%' operator
        result= i % j;       
        System.out.println("The result of i % j (modulus division sign): " + result + "\n");
        
        // '++' operator              
        System.out.println("i: " + i);
        result= ++i;
        System.out.println("The result of i++ (incrementation): " + result + "\n");
        i--;
        
        // '--' operator              
        System.out.println("i: " + i);
        result= --i;
        System.out.println("The result of i-- (decrementation): " + result + "\n");
        System.out.println();
        
        
        //HW1 part2 sample
        // Comparision operator
        //== operator
        boolean firstString=("Java"=="java");
        System.out.println ("String comparision using '==' is " + firstString);       
        
        //'!=' operator
        int k= 5, h= 9;
        boolean firstInt= (k != h);
        System.out.println("The ints we're comparing: i= " + i + " h= " + h);
        System.out.println("int comparision using the '!=' operator is " + firstInt);
        
        //'>' operator
        firstInt= (k > h);
        System.out.println("int comparision using the '>' operator is " + firstInt);
        
        //'<' operator
        firstInt= (k < h);
        System.out.println("int comparision using the '<' operator is " + firstInt);
        
        //'<=' operator
        firstInt= (k <= h);
        System.out.println("int comparision using the '<=' operator is " + firstInt);
        
        //'<' operator
        firstInt= (k >= h);
        System.out.println("int comparision using the '>=' operator is " + firstInt);        

    }
}