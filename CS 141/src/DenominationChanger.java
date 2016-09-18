import java.util.Scanner;

public class DenominationChanger {
	public static void main(String[] args){
		Scanner keyboardInput = new Scanner(System.in);
		char promptCheck;
		
		do {
			// code
			System.out.println("Enter a positive integer"
					+ " (quantity of pennies)");
			int inputValue = keyboardInput.nextInt();
			keyboardInput.nextLine();
			penniesToOtherDenominations(inputValue);
			
			System.out.println("\nPress any key and enter to continue.");
			System.out.println("Press q to quit.");
			String prompt = keyboardInput.nextLine();
			prompt = prompt.toLowerCase();
			promptCheck = prompt.charAt(0);
			System.out.println();
			
		}  while (!(promptCheck == 'q'));
		
		
	} // main method

	public static void penniesToOtherDenominations(int amount) {
		int totalNumberOfPennies = amount;
		String quarter = "quarter";
		String dime = "dime";
		String nickel = "nickel";
		String penny = "penny";

		int numberOfQuarters = totalNumberOfPennies / 25;
		totalNumberOfPennies = totalNumberOfPennies % 25;
		
		int numberOfDimes = totalNumberOfPennies / 10;
		totalNumberOfPennies = totalNumberOfPennies % 10;

		int numberOfNickels = totalNumberOfPennies / 5;
		totalNumberOfPennies = totalNumberOfPennies % 5;

		int numberOfPennies = totalNumberOfPennies;

		if ( !(numberOfQuarters == 0) ) {
			if ( !(numberOfQuarters == 1) ) {
				quarter = "quarters";
			}
			System.out.printf("%d %s\n", numberOfQuarters, quarter);
		}

		if ( !(numberOfDimes == 0) ) {
			if ( !(numberOfDimes == 1) ) {
				dime = "dimes";
			}
			System.out.printf("%d %s\n", numberOfDimes, dime);
		}


		if ( !(numberOfNickels == 0) ) {
			if ( !(numberOfNickels == 1) ) {
				nickel = "nickels";
			}
			System.out.printf("%d %s\n", numberOfNickels, nickel);
		}


		if ( !(numberOfPennies == 0) ) {
			if ( !(numberOfPennies == 1) ) {
				penny = "pennies";
			}
			System.out.printf("%d %s\n", numberOfPennies, penny);
		}
}
}