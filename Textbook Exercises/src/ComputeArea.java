import java.util.Scanner;
public class ComputeArea {

	public static void main(String[] args) {
		// code goes here:
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("The following program calculates"
				+ " the area of a circle given its radius.");
		System.out.println("Enter the radius: ");
		// prompting the user to enter the radius and storing value to input
		double input = Double.parseDouble(keyboardInput.nextLine() );
		areaOfCircle(input);
		
		
		
	} // end of main method
	
	// this method calculates the area of a circle
	// given its radius as an argument and prints out
	// what the area is given the radius 
	public static void areaOfCircle(double radius) {
		if (radius > 0) {
			double area = Math.pow(radius, 2) * Math.PI;
			System.out.printf("The area of the circle with"
					+ " a radius of %.0f is %.2f.", radius, area);
		} else {
			System.out.println("Invalid input.");
			System.out.println("The radius must be greater than 0.");
		}
	} // of areaOfCircle method
	
}  // end of ComputeArea class
