/* Title: KiloToPound Lab 6
 * Date: 09/20/20
 * Author: SebastianInocencio 
 */

package Lab6;

public class KiloToPound {

	public static void main(String[] args) {
		
		System.out.printf("%-20s%-20s\n", "Kilograms", "Pounds");
		
		// DECLARING VARIABLES
		double convert = 2.2;
		int kilos = 0;
		double pounds = 0.0;
		int i = 0;
		
		// WHILE STATEMENT
		while (i <= 18.0){
		
		{
			kilos++;
			i++;
			if(i % 2 == 1);
			
			{
				// DISPLAY CONVERSIONS
				pounds = (kilos * convert);
				System.out.printf("%-20d%-20.2f\n", kilos, pounds);
			}
			
			}
		}
	}
}