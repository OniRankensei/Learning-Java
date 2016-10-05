import java.util.ArrayList;
import java.util.Scanner;

public class Quiz3Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * Write a program which: 1. Asks the user to enter a positive integer
		 * greater than 0
		 * 
		 * 2. Validates that the entry is a positive integer
		 * 
		 * 3. Outputs the digits in reverse order with a space separating the
		 * digits (consider zero to be even)
		 * 
		 * 5. Outputs the odd digits not in reverse order with a space
		 * separating the digits
		 * 
		 * 6. Allows user is to repeat/continue the program as many times as
		 * he/she wants
		 * 
		 * 7. Keeps a record in a txt file named outDataFile.txt with the
		 * history of all numbers entered and the associated results, in the
		 * following format:
		 * 
		 * the original number is 1023 
		 * the number reversed 3 2 0 1 
		 * the even digits are 0 2 
		 * the odd digits are 1 3 
		 * ----------------- 
		 * the original number is 102030
		 * the number reversed 0 3 0 2 0 1
		 * the even digits are 0 2 0 0
		 * the odd digits are 1 3 -----------------
		 */

		ArrayList<Integer> numbersArray = new ArrayList<Integer>();

		System.out.println("Enter a positive integer greater than 0.");

		String userInput = input.nextLine();
		
		System.out.print("The original number is: ");

		for (int i = 0; i < userInput.length(); i++) {
			
			numbersArray.add(Character.getNumericValue(userInput.charAt(i) ) );
			
			System.out.printf("%d", numbersArray.get(i));
		} // end of loop
		
		int arraySize = numbersArray.size();
		System.out.println();
		
		/*for (int a = 0; a < arraySize; a ++) {
			System.out.printf("%d ",
					numbersArray.get((arraySize -1) - a));
			
		}*/
		reverse(numbersArray);
		even(numbersArray);
		odd(numbersArray);
		
		
	} // end of main

	/**
	 * Given a string, it validates the input to ensure the user entry is an
	 * integer.
	 * 
	 * @param userAnswer
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
	 * Given an Array List of size (n), it prints out its elements in reverse order.
	 * 
	 * @param object
	 * The instance variable for an Array List.
	 * 
	 * @param sizeOfObject
	 * The size of the Array List.
	 */
	public static void reverseTest(ArrayList<Integer> object, int sizeOfObject) {
		
		System.out.print("The number reversed is: ");
		
		for (int counter = 0; counter < sizeOfObject; counter ++) {
			System.out.printf("%d ",
					object.get((sizeOfObject -1) - counter));
			
		}
		
		System.out.println();
		
	} // end of reserve()

	public static void even(ArrayList<Integer> object) {
		
		System.out.print("The even digits are: ");
		
		for (int counter = 0; counter < object.size(); counter++) {
			
			
			if ( (object.get(counter) % 2) == 0){
				System.out.printf("%d ", object.get(counter) );
			}
		}
		
		System.out.println();
		
	} // end of even()

	public static void odd(ArrayList<Integer> object) {
		
		System.out.print("The odd digits are: ");

		for (int counter = 0; counter < object.size(); counter++) {

			if ( (object.get(counter) % 2) != 0 ) {
				System.out.printf("%d ", object.get(counter));
			}
		}

		System.out.println();

	} // end of odd()
	
	/**
	 * Given an Array List of size (n), it prints out its elements in reverse order.
	 * 
	 * @param object
	 * The instance variable for an Array List.
	 * 
	 * @param sizeOfObject
	 * The size of the Array List.
	 */
	public static void reverse(ArrayList<Integer> object) {
		
		System.out.print("The number reversed is: ");
		
		for (int counter = 0; counter < object.size(); counter ++) {
			System.out.printf("%d ",
					object.get( (object.size() - 1) - counter) );
			
		}
		
		System.out.println();
		
	} // end of reserve()
	

public static ArrayList<Integer> integerArrayListTest() {

	String userInput;
	int temporaryVariable;
	
	// creating a new Scanner object referenced by variable input
	Scanner input = new Scanner(System.in);

	// creating an ArrayList referenced by variable integerArrayList
	ArrayList<Integer> integerArrayList = new ArrayList<Integer>();
	
	// prompting user input
	System.out.println("Enter a positive integer greater"
		+ " than 0.");

	// collecting user input as a String
	userInput = input.nextLine();

	// validation goes here

	// printing out to console the elements of the Array List
	System.out.printf("The original number is: ", userInput);

	// converting each digit character into an int and adding to ArrayList
	for (int counter = 0; counter < userInput.length(); counter++) {

		// converting each digit character into an int
		temporaryVariable = Character.getNumericValue(userInput.charAt(counter) );

		// adding int to integerArrayList at index counter
		integerArrayList.add(temporaryVariable);

	} // end of for loop

	// printing an empty line
	System.out.println();
	
	// returning arrayList
	return integerArrayList;

} // end of integerArrayListTest()
}
