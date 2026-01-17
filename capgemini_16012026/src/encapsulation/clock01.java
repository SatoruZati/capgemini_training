package encapsulation;

public class clock01 {

	private int hour;
	private int minute;
	private int second;

	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}
	
	public int getSecond() {
		return second;
	}

	public void setTime(int hour, int minute, int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}

	public static void main(String[] args) {
		// two clock based programs to showcase encapsulation
		// clock01 has a private input time in 24 hour format hh:mm:ss
		// and public methods to set and get the time
		// clock02 uses clock01 to get time in 24 hour format
		// and public methods to set and get the time in 12 hour format 
		// inside its own variable and display them.

		clock01 clock = new clock01();
		clock.setTime(14, 30, 45);
		System.out.println("24 Hour Format: " + clock.getHour() + ":" + clock.getMinute() + ":" + clock.getSecond());

	}

}
