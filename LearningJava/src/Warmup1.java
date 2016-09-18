import java.util.Scanner;

class Warmup1 {
	public static void main (String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		System.out.println("This is a fibinacci sequence.");
		System.out.println("Enter a number where you would like to start: ");
		int firstNumber = Integer.parseInt(keyboardInput.nextLine());
		int fibSeq = 0;
		int newNumber = 0;
		
			for(int count = 0; count <= 10; count++) {
				newNumber = firstNumber;
				fibSeq = firstNumber + newNumber;
				newNumber = fibSeq;
			    System.out.println(fibSeq);
				
				
				
				
			}
	} // end of main
} // end of class