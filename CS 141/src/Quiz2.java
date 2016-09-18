import java.util.Scanner;
public class Quiz2 {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		// prompting user for input
		System.out.println("Enter a positive integer"
				+ " (quantity of pennies)");
		// taking input
		int inputValue = keyboardInput.nextInt();
		
		// using the monetaryConverter method
		monetaryConverter(inputValue);
	} // end of main method
	
	/*
	 * This method will take the value of the input assigned to 
	 * the variable inputValue as the parameter. The value of 
	 * the inputValue variable will be assigned to a the 
	 * totalNumberOfPennies variable, which itself will be used
	 * to calculate the number of quarters, dimes, nickels and pennies
	 * it the total number of pennies can be broken into. 
	 * 
	 * The method takes into account whether there will be any quarters,
	 * dimes, nickels or pennies left after it is broken down. If there
	 * are no quarters, nickels, dimes or pennies, the console will not
	 * print those denominations. 
	 * 
	 * The method also takes into account whether there is more than one
	 * denomination and uses the correct grammar--that is, the method
	 * uses the correct plurality.
	 */
	public static void monetaryConverter(int totalNumberOfPennies) {
		String quarter = "Quarter";
		String dime = "Dime";
		String nickel = "Nickel";
		String penny = "Penny";
		
		// calculating the number of quarters
		int numberOfQuarters = totalNumberOfPennies / 25;
		
		// calculating the remaining number of pennies
		totalNumberOfPennies = totalNumberOfPennies % 25;
		
		// calculating the number of dimes
		int numberOfDimes = totalNumberOfPennies / 10;
		
		// calculating the remaining number of pennies
		totalNumberOfPennies = totalNumberOfPennies % 10;
		
		// calculating the number of nickels
		int numberOfNickels = totalNumberOfPennies / 5;
		
		// calculating the remaining number of pennies
		totalNumberOfPennies = totalNumberOfPennies % 5;
		
		// the final remaining number of pennies
		int numberOfPennies = totalNumberOfPennies;
		
		System.out.println("\nThe least possible number of coins: ");
		// using singular or plural forms of monetary units
		// for quarter(s)
		if (!(numberOfQuarters == 0)) {
			if (!(numberOfQuarters == 1)) {
				quarter = "Quarters";
			}
			System.out.printf("%d %s\n", numberOfQuarters, quarter);
		}
		
		// using singular or plural forms of monetary units
		// for dime(s)
		if (!(numberOfDimes == 0)) {
			if (!(numberOfDimes == 1)) {
				dime = "Dimes";
			}
			System.out.printf("%d %s\n", numberOfDimes, dime);
		}
		
		// using singular or plural forms of monetary units
		// for nickels(s)
		if (!(numberOfNickels == 0)) {
			if (!(numberOfNickels == 1)) {
				nickel = "Nickels";
			}
			System.out.printf("%d %s\n", numberOfNickels, nickel);
		}
				
		// using singular or plural forms of monetary units
		// for pennies(s)
		if (!(numberOfPennies == 0)) {
			if (!(numberOfPennies == 1)) {
				penny = "Pennies";
			}
		System.out.printf("%d %s", numberOfPennies, penny);
		}
		
	} // end of monetaryConversion method
	
} // end of Quiz2 class
