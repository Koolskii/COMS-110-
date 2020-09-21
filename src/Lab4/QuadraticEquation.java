package Lab4;

import java.util.Scanner;

public class QuadraticEquation {

	public static void main(String[] args) {
		
		// USER INPUT
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a value for a: ");
        double a = input.nextDouble();
        System.out.print("Enter a value for b: ");
        double b = input.nextDouble();
        System.out.print("Enter a value for c: ");
        double c = input.nextDouble();

        
        // DISCRIMINANT
        double discriminant = b * b - 4.0 * a * c;
        discriminant = Math.pow(discriminant, 0.5);


        
        // IF ELSE STATEMENTS
        if(discriminant > 0 ) {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2.0 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + root1 + "and" + root2);

        }else if(discriminant == 0.0) {
            double root1 = -b / (2.0 * a);
            System.out.println("The root is " + root1);

        }else {
            System.out.println("The Equation has no real root.");

        }


        input.close();
    }

}