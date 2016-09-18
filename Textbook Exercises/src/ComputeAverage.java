import java.util.Scanner;

public class ComputeAverage {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		double sum = 0;
		double input;
		
		System.out.println("This program calculates the average" 
			+ " of 5 numbers.\n");
		// first number
		System.out.println("Please enter the first number");
		input = Double.parseDouble(keyboardInput.nextLine() );
		sum = sum + input;
		// second number 
		System.out.println("Please enter the second number");
		input = Double.parseDouble(keyboardInput.nextLine() );
		sum = sum + input;
		// third number
		System.out.println("Please enter the third number");
		input = Double.parseDouble(keyboardInput.nextLine() );
		sum = sum + input;
		// fourth number
		System.out.println("Please enter the fourth number");
		input = Double.parseDouble(keyboardInput.nextLine() );
		sum = sum + input;
		// fifth number
		System.out.println("Please enter the fifth number");
		input = Double.parseDouble(keyboardInput.nextLine() );
		sum = sum + input;
		
		System.out.printf("The average of the 5 numbers is %.2f.",
				averageOf5Numbers(sum));
		
	} // end of main method
	public static double averageOf5Numbers(double sum) {
		double average = sum / 5.0;
		return average;
	}
} // end of ComputeAverage class
