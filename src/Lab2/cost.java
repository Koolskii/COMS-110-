/* Title:	"Cost of Driving";
 * Date:	"current 09/01";
 * Author:	"SebastianInocencio"
 */

package Lab2;

import java.util.Scanner;

public class cost {

	public static void main(String[] args) {
	
		// ENTER THE DISTANCE, MPH, AND PPG
		Scanner in = new Scanner(System.in);
		System.out.print("Enter driving distance: ");
		double distance = in.nextDouble();
		System.out.println("Enter miles per gallon: ");
		double miles = in.nextDouble();
		System.out.println("Enter price per gallon: ");
		double price = in.nextDouble();
	
		
		// CALCULATE THE COST OF DRIVING
		double mpg = distance / miles;
		double cost = mpg * price;
		
		
		// SHOW TWO DECIMAL POINTS 
		double total = Math.round(cost*100.00)/100.00;
		
		
		// DISPLAYS THE COST OF DRIVING
		System.out.println("The cost of driving is: $" + total);
		
		
		in.close();
	}

}
