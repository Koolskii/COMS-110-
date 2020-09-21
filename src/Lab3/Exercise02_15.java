package Lab3;

import java.util.Scanner;

public class Exercise02_15 {

	public static void main(String[] args) {
		
		// USER INPUT
		Scanner in = new Scanner(System.in);
		System.out.print("Enter x1: ");
		double x1 = in.nextDouble();
		System.out.print("Enter y1: ");
		double y1 = in.nextDouble();
		System.out.print("Enter x2: ");
		double x2 = in.nextDouble();
		System.out.print("Enter y2: ");
		double y2 = in.nextDouble();
		
		
		// CALCULATE THE AREA
		  double distance = Math.sqrt(Math.pow((x2 - x1), 2)
				    + Math.pow((y2 - y1), 2));
		
		
		// DISPLAYS THE RESULTS
		
		System.out.println("The distance between the two points is " + distance);
		
		
		
		in.close();

	}

}
