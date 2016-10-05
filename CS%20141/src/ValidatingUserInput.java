import java.util.Scanner;

// check the following link for help on validation:
// http://stackoverflow.com/questions/3059333/validating-input-using-java-util-scanner

public class ValidatingUserInput {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		/*
		System.out.println("Please enter your first name.");
		String userName = keyboardInput.nextLine();
		userName = validatingUserName(userName);
		
		System.out.println("");
		
		System.out.println("Please enter your answer as an integer: ");
		String userAnswer = keyboardInput.nextLine();
		userAnswer = userAnswerValidation(userAnswer);
		*/
		positiveIntegertValidation(); // accepts whiltespace and carriage returns :(
		
	}
	/**
	 * 
	 * @param userName
	 * A string.
	 * @return
	 * A string composed of letters.
	 */
	public static String validatingUserName(String userName) {
		int userNameLength = userName.length();
		int counter = 0;
		
		Scanner keyboardInput = new Scanner(System.in);
		
		while (userNameLength == 0) {
			System.out.println("This is an invalid entry.");
			System.out.println("Please enter your first name.");
			userName = keyboardInput.nextLine();
			userNameLength = userName.length();
		} // end of first while branch
		
		while (counter < userNameLength) {
			if (!Character.isLetter(userName.charAt(counter))) {
				System.out.println("This is an invalid entry.");
				System.out.println("Please enter your first name.");
				userName = keyboardInput.nextLine();
				userNameLength = userName.length();
				counter = 0;
			} else { // end of if / start of else
				counter++;
			} while (userNameLength == 0) { // end of else / start of while
				System.out.println("This is an invalid entry.");
				System.out.println("Please enter your first name.");
				userName = keyboardInput.nextLine();
				userNameLength = userName.length();
			} // end of third while branch
		} // end of second while branch
		System.out.printf("Thank you %s.", userName);
		return userName;
	} // end of ValidatingUserInput method
	
	/**
	 * Given a string, it validates the input to ensure the user entry is an integer.
	 * @param userAnswer
	 * A string.
	 * @return
	 * An int.
	 */
	public static String userAnswerValidation(String userAnswer) {
		int userAnswerLength = userAnswer.length();
		int counter = 0;
		
		Scanner keyboardInput = new Scanner(System.in);
		
		while (userAnswerLength == 0) {
			System.out.println("This is an invalid entry.");
			System.out.println("Please enter your answer as an integer:");
			userAnswer = keyboardInput.nextLine();
			userAnswerLength = userAnswer.length();			
		}
		while (counter < userAnswerLength) {
			if (!Character.isDigit(userAnswer.charAt(counter)) ) {
				System.out.println("This is an invalid entry.");
				System.out.println("Please enter your answer as an integer: ");
				userAnswer = keyboardInput.nextLine();
				userAnswerLength = userAnswer.length();
				counter = 0;
			} else {
				counter++;
			} while (userAnswerLength == 0) {
				System.out.println("This is an invalid entry.");
				System.out.println("Please enter your answer as an integer: ");
				userAnswer = keyboardInput.nextLine();
				userAnswerLength = userAnswer.length();
			}
		}
		return userAnswer;
	}
	/**
	 * Validates user input to ensure the user input yields a positive integer.
	 * @param 
	 * 
	 * @return
	 * an integer.
	 */
	public static int positiveIntegertValidation() {
		int numberEntered;
		Scanner keyboardInput = new Scanner(System.in);
		
		do {
			System.out.println("Please enter your answer as an integer greater than zero: ");
			while(!keyboardInput.hasNextInt() ) {
				System.out.println("This is an invalid entry. Please"
						+ " enter your answer as an integer greater than zero: ");
				keyboardInput.next();
			}
			numberEntered = keyboardInput.nextInt();
		} while (numberEntered <= 0);
		System.out.printf("Thank you. Your answer is %d.", numberEntered);
		return numberEntered;
	}

} // end of ValidatingUserInput class
