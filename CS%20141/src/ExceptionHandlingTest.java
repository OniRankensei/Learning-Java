import java.util.Scanner;
import java.util.InputMismatchException;

public class ExceptionHandlingTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		boolean exception = false;
		int number = 0;

		do {

			try {
				System.out.println("Enter first num: ");
				number = input.nextInt();
				exception = true;

			} catch (Exception e) {
				System.out.println("Please enter a number");
				input.next();
			}
			
		} while (!exception);
	}
}