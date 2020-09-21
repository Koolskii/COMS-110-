// File: Cylinder.java
// Name: Sebastian Inocencio
// Date: 08/27/20

package Lab1;
import java.util.Scanner;
public class Cylinder {

	public static void main(String[] args) {
	
		
		
		// ENTER THE RADIUS AND THE LENGTH
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the radius: ");
		double radius = in.nextDouble();
		System.out.println("Enter the length: ");
		double length = in.nextDouble();
		
		// CALCULATE THE AREA AND VOLUME   
		double area = radius * radius * Math.PI;
		double volume = area * length;
		
		// DISPLAYS THE ANSWER
		System.out.println("Area of the circle is " + area);
		System.out.println("Volume of the circle is " + volume);
		
	in.close();
		
	}
            
}
                                 