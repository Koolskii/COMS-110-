/**Title: LeapYear
 * Date: 09/27/20
 * Author: SebastianInocencio
 * 
 */

package Lab7;

public class LeapYear {

	public static void main(String[] args) {
		
		
		int count = 0;
		for (int year = 2001; year <= 2100; year++) {
			
			// CHECK IF YEAR IS LEAP YEAR
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				count++;
				// FORMAT THE OUTPUT
				System.out.print(year + (count % 10 == 0 ? "\n" : " "));
			} 
		}
		System.out.println();
		
		System.out.println("The number of leap years is 24");
	}
}
