import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class Quiz3Test2 {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter writeFile = new PrintWriter("Quiz3Test.txt");

		ArrayList<Integer> newArrayList;

		newArrayList = integerArrayListTest();
		reverse(newArrayList);
		even(newArrayList);
		odd(newArrayList);
		
		writeFile.close();
		//input.close();

	} // end of main

	/**
	 * Given a string, it validates the input to ensure the user entry is an
	 * integer.
	 * 
	 * @param userInput
	 *            A string.
	 * @return An int.
	 */
	public static void validate(String userInput) {
		int userAnswerLength = userInput.length();
		int counter = 0;

		Scanner keyboardInput = new Scanner(System.in);

		while (userAnswerLength == 0) {
			System.out.println("This is an invalid entry.");
			System.out.println("Please enter a positive integer:");
			userInput = keyboardInput.nextLine();
			userAnswerLength = userInput.length();
		}
		while (counter < userAnswerLength) {
			if (!Character.isDigit(userInput.charAt(counter))) {
				System.out.println("This is an invalid entry.");
				System.out.println("Please enter a positive integer:");
				userInput = keyboardInput.nextLine();
				userAnswerLength = userInput.length();
				counter = 0;
			} else {
				counter++;
			}
			while (userAnswerLength == 0) {
				System.out.println("This is an invalid entry.");
				System.out.println("Please enter a positive integer: ");
				userInput = keyboardInput.nextLine();
				userAnswerLength = userInput.length();
			}
		}
	} // end of validate()

	/**
	 * Given an Array List of size (n), it prints out its elements in reverse
	 * order.
	 * 
	 * @param object
	 *            The instance variable for an Array List.
	 * 
	 * @param sizeOfObject
	 *            The size of the Array List.
	 */

	public static void reverse(ArrayList<Integer> object) {

		System.out.print("The number reversed is: ");

		for (int counter = 0; counter < object.size(); counter++) {

			System.out.printf("%d ", object.get((object.size() - 1) - counter));

		}

		System.out.println();

	} // end of reserve()

	public static void even(ArrayList<Integer> object) {

		System.out.print("The even digits are: ");

		for (int counter = 0; counter < object.size(); counter++) {

			if ((object.get(counter) % 2) == 0) {

				System.out.printf("%d ", object.get(counter));
			}
		}

		System.out.println();

	} // end of even()

	public static void odd(ArrayList<Integer> object) {

		System.out.print("The odd digits are: ");

		for (int counter = 0; counter < object.size(); counter++) {

			if ((object.get(counter) % 2) != 0) {

				System.out.printf("%d ", object.get(counter));
			}
		}

		System.out.println();

	} // end of odd()

	/**
	 * Creates an ArrayList of Integers given user input. It prints out the
	 * elements of the list in the order in which they were entered.
	 * 
	 * @return An ArrayList object.
	 */
	public static ArrayList<Integer> integerArrayListTest() {

		String userInput;
		int temporaryVariable;

		// creating a new Scanner object referenced by variable input
		Scanner input = new Scanner(System.in);

		// creating an ArrayList referenced by variable integerArrayList
		ArrayList<Integer> integerArrayList = new ArrayList<Integer>();

		// prompting user input
		System.out.println("Enter a positive integer greater" + " than 0.");

		// collecting user input as a String
		userInput = input.nextLine();

		// validation goes here

		// printing out to console the elements of the Array List
		System.out.printf("The original number is: ", userInput);

		// converting each digit character into an int and adding to ArrayList
		for (int counter = 0; counter < userInput.length(); counter++) {

			// converting each digit character into an int
			temporaryVariable = Character.getNumericValue(userInput.charAt(counter));

			// adding int to integerArrayList at index counter
			integerArrayList.add(temporaryVariable);

			// printing out each int
			System.out.printf("%d", temporaryVariable);

		} // end of for loop

		// printing an empty line
		System.out.println();

		// returning arrayList
		return integerArrayList;

	} // end of integerArrayListTest()
}
