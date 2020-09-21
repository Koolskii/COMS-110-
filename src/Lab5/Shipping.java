/* Title: Shipping Lab 5
 * Date: 09/15/20
 * Author: Sebastian Inocencio 
 */


package Lab5;

import java.util.Scanner;

public class Shipping {

	public static void main(String[] args) {
		
		// USER INPUT
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the weight of your package: ");
        double weight = input.nextDouble();
        
        if (weight <= 0) {
        	System.out.println("Invalid input. Value must be greater than 0 pounds");
        	}
        
        else if (weight > 20) {
        	
        	System.out.println("The package cannot be shipped. Value must be 20 pounds or less.");	
        }
        
        // CALCULATE THE PRICE
        
        else  {  
      double price = 0;
      if (weight == 1) {
    	  price = 3.5;
      }
      
      else if (weight > 1 && weight <= 3) {
    	 price = 5.5 ;
      }
      else if (weight > 3 && weight <= 10) {
    	price = 8.5;
      }
      else if (weight > 10 && weight <= 20) {
    	  price = 10.5;
      }
      
      	// DISPLAY WEIGHT AND SHIPPING COSTS
      
       System.out.println("The package weighs " + weight + "");
       System.out.println("The package costs $" + price);	
        
        
        
       input.close();
       
        }
	}
}
		