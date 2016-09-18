import java.util.Scanner;

public class DisplayTime {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		int input, minutes, seconds, remainingSeconds;
		
		// code goes here
		System.out.println("Enter an integer in seconds: ");
		input = Integer.parseInt(keyboardInput.nextLine() );
		displayTime(input);
		
	} // end of main method
	public static void displayTime(int seconds){
		int minutes = seconds / 60;
		int remainingSeconds = seconds % 60;
		System.out.printf("%d seconds is %d minutes and %d seconds.",
				seconds, minutes, remainingSeconds);
	}
} // end of DisplayTime class
