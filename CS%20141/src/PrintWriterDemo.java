import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.*;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		Scanner input = new Scanner(System.in);
		PrintWriter writeFile = new PrintWriter("Quiz3Test.txt");

		ArrayList<Integer> newArrayList;
		
		String userInput;
		char testValue;
		
		
		do {
			newArrayList = integerArrayListTest(writeFile);
			reverse(newArrayList, writeFile);
			even(newArrayList, writeFile);
			odd(newArrayList, writeFile);
			
			System.out.println();
			System.out.println("Would you like to continue?");
			System.out.print("Press 'y' to continue or 'n' to exit.");
			System.out.println();
			
			userInput = input.nextLine();
			testValue = userInput.charAt(0);
			
		} while (testValue == 'y' || testValue == 'Y');
		
		writeFile.close();
		//input.close();
		
		System.out.println("The file has been written");

	} // end of main

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

	public static void reverse(ArrayList<Integer> object, PrintWriter writeFile) {
		
		System.out.print("The number reversed is: ");
		writeFile.print("The number reversed is: ");

		for (int counter = 0; counter < object.size(); counter++) {

			System.out.printf("%d ", object.get((object.size() - 1) - counter));
			writeFile.printf("%d ", object.get((object.size() - 1) - counter));

		}
		
		System.out.println();
		writeFile.println();

	} // end of reserve()

	public static void even(ArrayList<Integer> object, PrintWriter writeFile) {
		PrintWriter evenWriter = writeFile;
		
		System.out.print("The even digits are: ");
		writeFile.print("The even digits are: ");

		for (int counter = 0; counter < object.size(); counter++) {

			if ((object.get(counter) % 2) == 0) {
				
				System.out.printf("%d ", object.get(counter));
				writeFile.printf("%d ", object.get(counter));
			}
		}

		System.out.println();
		evenWriter.println();

	} // end of even()

	public static void odd(ArrayList<Integer> object, PrintWriter writeFile) {

		System.out.print("The odd digits are: ");
		writeFile.print("The odd digits are: ");

		for (int counter = 0; counter < object.size(); counter++) {

			if ((object.get(counter) % 2) != 0) {
				
				System.out.printf("%d ", object.get(counter));
				writeFile.printf("%d ", object.get(counter));
			}
		}

		System.out.println();
		writeFile.println();

		
		System.out.println("--------------------------------------");
		writeFile.println("--------------------------------------");

	} // end of odd()

	/**
	 * Creates an ArrayList of Integers given user input. It prints out the
	 * elements of the list in the order in which they were entered.
	 * 
	 * @return An ArrayList object.
	 */
	public static ArrayList<Integer> integerArrayListTest(PrintWriter writeFile) {

		PrintWriter firstWriter = writeFile;
		
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
		userInput = validation(userInput);

		// validation goes here

		// printing out to console the elements of the Array List
		System.out.printf("The original number is: ", userInput);
		
		// printing out to file the elements of the Array List
		firstWriter.printf("The original number is: ", userInput);

		// converting each digit character into an int and adding to ArrayList
		for (int counter = 0; counter < userInput.length(); counter++) {

			// converting each digit character into an int
			temporaryVariable = Character.getNumericValue(userInput.charAt(counter));

			// adding int to integerArrayList at index counter
			integerArrayList.add(temporaryVariable);

			// printing out each int
			System.out.printf("%d", temporaryVariable);
			firstWriter.printf("%d", temporaryVariable);

		} // end of for loop

		// printing an empty line
		System.out.println();
		firstWriter.println();

		// returning arrayList
		return integerArrayList;

	} // end of integerArrayListTest()
	
	/**
	 * Given a string, it validates the input to ensure the user entry is an integer.
	 * @param userAnswer
	 * A string.
	 * @return
	 * An int.
	 */
	public static String validation(String userInput) {
		int userInputLength = userInput.length();
		int counter = 0;
		
		Scanner keyboardInput = new Scanner(System.in);
		
		while (userInputLength == 0) {
			System.out.println("This is an invalid entry.");
			System.out.println("Please enter your answer as an integer:");
			userInput = keyboardInput.nextLine();
			userInputLength = userInput.length();			
		}
		while (counter < userInputLength) {
			if (!Character.isDigit(userInput.charAt(counter)) ) {
				System.out.println("This is an invalid entry.");
				System.out.println("Please enter your answer as an integer: ");
				userInput = keyboardInput.nextLine();
				userInputLength = userInput.length();
				counter = 0;
			} else {
				counter++;
			} while (userInputLength == 0) {
				System.out.println("This is an invalid entry.");
				System.out.println("Please enter your answer as an integer: ");
				userInput = keyboardInput.nextLine();
				userInputLength = userInput.length();
			}
		}
		return userInput;
	}
}
