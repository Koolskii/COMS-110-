/*Title:	"AdditionQuiz"
 * Date:	"09/03/20"
 * Author: 	"SebastianInocencio"
 */


package Lab3;


import java.util.Scanner;

public class AdditionQuiz {

	public static void main(String[] args) {
			
		
		
	// ASSIGN A RANDOM NUMBER FOR EACH VARIABLE
		
		int number1 = 10 + (int)(Math.random() * 89);
		int number2 = 10 + (int)(Math.random() * 89);
		int number3 = 10 + (int)(Math.random() * 89);
		
	
	// USER INPUT
	Scanner in = new Scanner(System.in);
	System.out.print("What is " + number1 + " + "  + number2 + " + " + number3 + " = " );
	int answer = in.nextInt();
	
	
	// CHECKS FOR ANSWERS AND DISPLAYS TRUE OR FALSE
		if (number1 + number2 + number3 == answer) {
			
			System.out.println( + number1 + " + "  + number2 + " + " + number3 + " is true" );
		}
		
		else {
			
			System.out.println( + number1 + " + "  + number2 + " + " + number3 + " is false" );
			
			
			in.close();
		}
		
	}
	
}




