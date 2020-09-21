/* Title: Sum Lab 6
 * Date: 09/20/20
 * Author: SebastianInocencio
 */

package Lab6;

public class Sum {

	public static void main(String[] args) {
		
		// DECLARING VARIABLES
			int i = 0;
			int even = 0;
			int odd = 0;
			
		// GENERATES 10 NUMBERS	
			while (i <= 10) {
				int random = (int)(Math.random() * 91 + 10);
				
				//DETERMINES IF ODD OR EVEN
				if (random % 2 == 0) {
					even = random + even;
					System.out.print(" " + random);
				}
				
				else {
					odd = odd + random;
					System.out.print(" " + random);
					
				}
				System.out.printf("\n");
				i++;
				
			// DISPLAYS THE SUM OF THE ODD AND EVEN NUMBERS
			}
			
			System.out.println("The sum of odd is: " + odd);
			System.out.println("The sum of odd is: " + even);
	}

}
