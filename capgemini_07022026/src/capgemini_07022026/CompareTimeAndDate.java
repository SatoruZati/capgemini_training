package capgemini_07022026;

public class CompareTimeAndDate {
	// Compare Time and Date
	public static void main(String[] args) {
		
		String date1 = "10-12-2004";
		String date2 = "17-09-2004";
		
		String time1 = "10:30:45";
		String time2 = "07:17:30";
		
		// Sorting dates
		if (date1.compareTo(date2) > 0) {
			System.out.println(date1 + " is earlier than " + date2);
		} else if (date1.compareTo(date2) < 0) {
			System.out.println(date1 + " is later than " + date2);
		} else {
			System.out.println(date1 + " is equal to " + date2);
		}

		// Sorting times
		if (time1.compareTo(time2) < 0) {
			System.out.println(time1 + " is earlier than " + time2);
		} else if (time1.compareTo(time2) > 0) {
			System.out.println(time1 + " is later than " + time2);
		} else {
			System.out.println(time1 + " is equal to " + time2);
		}
		
		// sorting in both date and time
		if (date1.compareTo(date2) > 0) {
			System.out.println(date1 + " is earlier than " + date2);
		} else if (date1.compareTo(date2) < 0) {
			System.out.println(date1 + " is later than " + date2);
		} else {
			if (time1.compareTo(time2) > 0) {
				System.out.println(time1 + " is earlier than " + time2);
			} else if (time1.compareTo(time2) < 0) {
				System.out.println(time1 + " is later than " + time2);
			} else {
				System.out.println(time1 + " is equal to " + time2);
			}
		}
	}
}
