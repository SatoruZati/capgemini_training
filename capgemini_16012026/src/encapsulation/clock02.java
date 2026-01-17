package encapsulation;

public class clock02 {

	public static void main(String[] args) {
		// two clock based programs to showcase encapsulation
		// clock01 has a private input time in 24 hour format hh:mm:ss
		// and public methods to set and get the time
		// clock02 uses clock01 to get time in 24 hour format
		// and public methods to set and get the time in 12 hour format 
		// inside its own variable and display them.
		
		clock01 clock = new clock01();
		clock.setTime(22, 30, 45);
		int hour24 = clock.getHour();
		int minute = clock.getMinute();
		int second = clock.getSecond();

		// Convert 24 hour format to 12 hour format
		String period = "AM";
		int hour12 = hour24;

		if (hour24 >= 12) {
			period = "PM";
			if (hour24 > 12) {
				hour12 = hour24 - 12;
			}
		}

		// Display the time in both formats
		System.out.println("24 Hour Format: " + hour24 + ":" + minute + ":" + second);
		System.out.println("12 Hour Format: " + hour12 + ":" + minute + ":" + second + " " + period);

	}

}
