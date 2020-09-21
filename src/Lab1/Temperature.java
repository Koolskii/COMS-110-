package Lab1;
import java.util.*;
public class Temperature {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the temp in fah:  ");
		double  fah = in.nextDouble();
		double celsius = (5.0/9)*(fah - 32);
		System.out.println("temp in celsius " + celsius);
		
		
		in.close();
	}

}
