import java.util.Scanner;

public class QuizTest {
	public static void main(String[] arguments) {
		Scanner keyboardInput = new Scanner(System.in);

		double average; // declaring variable for the average
		double sum = 0; // initializing variable for the sum of numbers
		double inputValue; //initializing variable for input values

		// short description of program and instructions
		System.out.print("This program will prompt you" 
			+ " for 5 numbers");
		System.out.println(" and then display their average.");
		System.out.println("Please only enter numbers.\n");

		// prompting user input for first number
		System.out.println("Enter the first number:");

		// storing user input in variable inputValue
		inputValue = keyboardInput.nextDouble();

		/* the variable sum will store the sum of itself and the
		value of the variable inputValue, thus allowing the variable
		inputValue to be reused for the collection of input
		*/
		sum += inputValue;

		System.out.println("Enter the second number:");
		inputValue = keyboardInput.nextDouble();
		sum += inputValue;

		System.out.println("Enter the third number:");
		inputValue = keyboardInput.nextDouble();
		sum += inputValue;

		System.out.println("Enter the fourth number:");
		inputValue = keyboardInput.nextDouble();
		sum += inputValue;

		System.out.println("Enter the fifth number:");
		inputValue = keyboardInput.nextDouble();
		sum += inputValue;

		// calculating the average of the 5 numbers entered
		average = sum / 5.0;

		// displaying the average to the console
		System.out.println("The average of the five numbers is " + average);
	}
}