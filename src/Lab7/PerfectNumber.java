/**Title: PerfectNumber
 * Date: 09/27/20
 * Author: SebastianInocencio
 * 
 */

package Lab7;

public class PerfectNumber {

	public static void main(String[] args) {
		
		  // VARIABLE
		  int sum = 0;
		 
		 // GOES THROUGH EVERY NUMBER FROM 1-10000
		  for (int i = 1; i <= 10000; i++) {
		   for (int j = 1; j < i; j++) {
		    if (i % j == 0) {
		     sum += j;
		    }
		   }
		 
		   // DISPLAYS THE PERFECT NUMBERS
		   if (sum == i) {
		    System.out.println(i + " is a perfect number");
		    
		   }
		   
		   
		   sum = 0;
		  }
		 
		 }
		 
		
	}

