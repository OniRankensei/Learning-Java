import java.util.Scanner;

public class FahrenheitToCelcius {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		// this program takes degrees in Fahrenheit and converts
		// it into degrees in Celcius.
		System.out.println("Enter a degree in Fahrenheit:");
		double fahrenheitInput = Double.parseDouble(keyboardInput.nextLine() );
		convertFahrenthetToCelcius(fahrenheitInput);
	}
	public static void convertFahrenthetToCelcius(double degrees) {
		double celcius = (5.0 / 9) * (degrees - 32);
		System.out.printf("Fahrenheit %.2f is %.2f in Celcius.", degrees, celcius);
	}
}
