import java.util.Scanner;

public class QuizOne {
	public static void main(String[] arguments) {
		Scanner keyboardInput = new Scanner(System.in);

		double average;
		double sum = 0;
		double inputValue;

		System.out.println("This program will prompt you" 
			+ "for 5 numbers");
		System.out.println("and then display their average.\n");

		System.out.println("Enter the first number:");
		inputValue = Double.parseDouble(keyboardInput.nextLine());
		sum += inputValue;

		System.out.println("Enter the second number:");
		inputValue = Double.parseDouble(keyboardInput.nextLine());
		sum += inputValue;

		System.out.println("Enter the third number:");
		inputValue = Double.parseDouble(keyboardInput.nextLine());
		sum += inputValue;

		System.out.println("Enter the fourth number:");
		inputValue = Double.parseDouble(keyboardInput.nextLine());
		sum += inputValue;

		System.out.println("Enter the fifth number:");
		inputValue = Double.parseDouble(keyboardInput.nextLine());
		sum += inputValue;

		average = sum / 5.0;

		System.out.println("The average of the five numbers is " + average);
	}
}