import java.util.Scanner;

public class ComputeChange {
	public static void main(String[] args){
		Scanner keyboardInput = new Scanner(System.in);
		
		// Listing 2.10
		// This program changes a given amount of money
		// into smaller monetary units.
		monetaryChanger(11.56);
		
		
	} // end of main method
		public static void monetaryChanger(double amount) {
			int remainingAmount = (int) amount * 100;
			
			int numberOfDollars = remainingAmount / 100;
			remainingAmount = remainingAmount % 100;
			
			int numberOfQuarters = remainingAmount / 25;
			remainingAmount = remainingAmount % 25;
			
			int numberOfDimes = remainingAmount / 10;
			remainingAmount = remainingAmount % 10;
			
			int numberOfNickels = remainingAmount / 5;
			remainingAmount = remainingAmount % 5;
			
			int numberOfPennies = remainingAmount;
			
			System.out.printf("Your amount of %.2f consists of:", amount);
			System.out.printf("\n\t%d dollars", numberOfDollars);
			System.out.printf("\n\t%d quarters", numberOfQuarters);
			System.out.printf("\n\t%d dimes", numberOfDimes);
			System.out.printf("\n\t%d nickels", numberOfNickels);
			System.out.printf("\n\t%d cents", numberOfPennies);
		}
} // end of class
