public class SecondsForTrig {
	public static void main (String[] args) {
		// this program converts degrees into seconds
		
		int answer = degreesInSeconds(90.56);
		System.out.println(answer);
	}
	// this method converts degrees into seconds
	public static int degreesInSeconds(double degrees) {
		int seconds = 3600; // there are 3600 seconds per degree
		int totalSeconds = (int) degrees * seconds; // parsing
		return totalSeconds; // returns the total number of seconds
	}
}
