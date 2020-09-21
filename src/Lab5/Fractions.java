/* Title: Shipping Lab 5
 * Date: 09/15/20
 * Author: Sebastian Inocencio 
 */

package Lab5;

import java.util.Scanner;

public class Fractions {

	public static void main(String[] args) {
		
		
		// USER INPUT
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the numerator: ");
        int numerator = input.nextInt();
        System.out.print("Enter the denominator: ");
        int denominator = input.nextInt();
        
        // IF DENOMINATOR IS ZERO
        	if (denominator == 0) {
        		System.out.println("Not a fraction. The denominator cannot be zero");
        	}
        	
        // PROPER FRACTION
        	else if (numerator < denominator) {
        	System.out.println(numerator + "/" + denominator + " is a proper fraction.");
        }
        
        // IMPROPER FRACTION
      
        	else if(numerator % denominator != 0) {
        		
        	int mix = numerator / denominator;
            int remainder = numerator % denominator;
            
            	System.out.println(numerator + "/" + denominator + "is an improper fraction and its mixed fraction is " + mix + "+ " + remainder + "/" + denominator);
        	}
        
        	else {
        		int whole = numerator / denominator;
        		System.out.println(numerator + "/" + denominator + " is an improper fraction and can be reduced to " + whole);
        	}
        		
       
        
        input.close();
		
	}
}
        	


        
