import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int secInt;
        double secDouble;
        String secStrn;
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        secInt = scan.nextInt();
        secDouble = scan.nextDouble();
        scan.nextLine();
        secStrn = scan.nextLine();
       // System.out.println(secStrn);
        /* Print the sum of both integer variables on a new line. */
        //int intSum = i + secInt;
        System.out.println(i+secInt);
        /* Print the sum of the double variables on a new line. */
		//double doubleSum = d + secDouble;
        System.out.println(d+secDouble);
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        //String concat = s + secStrn;
        System.out.println(s+secStrn);
        scan.close();
    }
}
