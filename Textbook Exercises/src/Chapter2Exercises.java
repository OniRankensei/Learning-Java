
public class Chapter2Exercises {
	public static void main (String[] args){
		
		// 2.10 in order: byte, short, int, long, float and double
		/*
		 * byte -2^7 to 2^7 (-128 to 127)
		 * short -2^15 to -2^15 (-32768 to 32767)
		 * int -2^31 to 2^31 (-2147583648 to 2147483647)
		 * long -2^63 to 2^63 (-9223372036854775808 to
		 * 9223372036854775807)
		 * float 32-bit IEE754 precision between 7 and 8 places
		 * double 64-bit IIEE754 precision between 15 and 17 places
		 * 
		 * A byte takes the least amount of memory since it only
		 * takes up a byte or 8 bits.
		 */
		
		// 2.11 Show the results of the following remainders
		System.out.println("\nThis is Exercise 2.11.");
		int division1 = 56 % 6;
		System.out.println(division1); // prints out 2
		int division2 = 78 % -4;
		System.out.println(division2); // prints out 2
		int division3 = -34 % 5;
		System.out.println(division3); // prints out -4
		int division4 = -34 % -5;
		System.out.println(division4); // prints out -4
		int division5 = 5 % 1;
		System.out.println(division5); // prints out 0
		int division6 = 1 % 5;
		System.out.println(division6); // prints out 1
		
		
		// 2.12 If today is Tuesday, what will be the day in 100 days?
		System.out.println("\n This is Exercise 2.12.");
		int daysFromNow = 100 % 7; // days in question modulus numbers of days in a week
		System.out.println(daysFromNow);
		
		// 2.13 What is the result of 25 / 4? How would you rewrite the
		// expression if you wished the result to be a floating-point number?
		System.out.println("\nThis is Exercise 2.13");
		double result = (double) 25 / 4; // parse to double using (double)
		System.out.println(result); // results = 6.25
		
		
		// 2.14 Show the result of the following code:
		System.out.println("\nThis is Exercise 2.14.");
		System.out.println(2 * (5 / 2 + 5 / 2)); // prints out 8
		System.out.println(2 * 5 / 2 + 2 * 5 / 2); // prints out 10
		System.out.println(2 * (5 / 2)); // prints out 4
		System.out.println(2 * 5 / 2); // prints out 5
		
		// 2.15 Are the following statements correct? If so, show the output.
		System.out.println("\nThis is Exercise 2.16.");
		System.out.println("25 / 4 is " + 25 / 4); // is incorrect
		System.out.println("25 / 4.0 is " + 25 / 4.0); // prints out 6.25
		System.out.println("3 * 2 / 4 is " + 3 * 2 / 4); // is incorrect
		System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4); // prints out 1.5
		
		// 2.17 Suppose m and r are integers. Write a Java expression for mr^2
		// to obtain a floating-point result.
		System.out.println("\nThis is Exercise 2.17.");
		int m = 2;
		int r = 3;
		// using the Math.pow method and parsing using (double)
		double floatingPointResult = (double) Math.pow(m, r);
		System.out.println(floatingPointResult); // prints out 8.0
		
		// 2.18 How many accurate digits are stored in a float or a double type variable?
		/*
		 * There are 7 to 8 accurate digits stored in a float and 15
		 * to 17 accurate digits stored in a double type variable.
		 */
		
		// 2.19 Which of the following are correct literals for floating-point numbers?
		System.out.println("\nThis is Exercise 2.19.");
		System.out.println(12.3); // correct; prints out 12.3
		System.out.println(12.3e+2); // correct; prints out 1230.0
		System.out.println(23.4e-2); // correct; prints out 0.234
		System.out.println(-334.4); // correct; prints out -334.4
		System.out.println(20.5); // correct; prints out 20.5
		System.out.println(39F); // correct; prints out 39.0
		System.out.println(40D); // correct; prints out 40.00
		
		// 2.20 Which of the following are the same as 52.534?
		System.out.println("\nThis is Exercise 2.20.");
		System.out.println(5.2534e+1); // same as 52.534
		System.out.println(0.52534e+2); // same as 52.534
		System.out.println(525.34e-1); // same as 52.534
		System.out.println(5.2534e+0); // prints out 5.2534
		
		// 2.21 Which of the following are correct literals?
		System.out.println("\nThis is Exercise 2.21.");
		System.out.println(5_2534e+1); // correct literal
		// System.out.println(_2534); // incorrect literal
		System.out.println(5_2); // correct literal
		// System.out.println(5_); // incorrect literal
		
		
		
		
	}
}
