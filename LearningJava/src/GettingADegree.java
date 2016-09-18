import java.util.Scanner;

public class GettingADegree {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		double degrees = 0; // d for degrees of a circle
		double radians = 0; // r for radians
		int fahrenheit; // f for degrees in Fahrenheit
		int celcius; // c for degrees in Celsius
		int kelvin; // k for degrees in Kelvin
		
		//System.out.println("Enter 'r' to convert degrees into radians.");
		//char typeToConvert = keyboardInput.next().trim().charAt(0);
		while (true) {
		System.out.println("Enter the number of degrees to the closests whole number: ");
		degrees = Integer.parseInt(keyboardInput.nextLine() );
		radians = (degrees * Math.PI/180) * 1.0;
		System.out.println(degrees + " degrees converts to " + radians + " radians.");
		}
		
		
	} // end of main
} // end of GettingADegress class
