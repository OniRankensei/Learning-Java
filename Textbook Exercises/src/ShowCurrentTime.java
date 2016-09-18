
public class ShowCurrentTime {
	public static void main(String[] args){
	
		// Obtain the total milliseconds since midnight, Jan 1, 1970.
		long totalMilliseconds = System.currentTimeMillis();
		
		// Obtain the total seconds since midnight, Jan 1, 1978.
		long totalSeconds = totalMilliseconds / 1000;
		// there are 1000 milliseconds in a second
		
		// Compare the current second in the minute in the hour
		long currentSecond = totalSeconds % 60;
		
		// Obtain the total minutes
		long totalMinutes = totalSeconds / 60;
		
		// Compute the current minute in the hour
		long currentMinutes = totalMinutes % 60;
		
		// Obtain the total hours
		long totalHours = totalMinutes / 60;
		
		// Compute the current hour
		long currentHour = totalHours % 24;
		
		// Display results
		System.out.printf("Current time is %d:%d:%d GMT.", currentHour, currentMinutes, currentSecond);
		
	}
}
