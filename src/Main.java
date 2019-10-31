import java.util.Scanner;

public class Main {

	public static void main(String[] args)
	{
		Scanner scnr = new Scanner(System.in);
		
		final double MILES_FEET = 5280; 
		final double MILES_ROMAN_FEET = 4854; 
		
		double x = scnr.nextDouble(); 
		
		
		double num = (1000 * (MILES_FEET / MILES_ROMAN_FEET)) * x; 
		
		 
		System.out.println(Math.round(num)); 
	}
}
