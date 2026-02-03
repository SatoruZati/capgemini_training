package capgemini_03022026;

public interface Job {
	// abstract method
	public void showJobDetails();
	
	// the interface is called functional interface if it contains only one abstract method
	
	// private method in interface
	private void jobSalary() {
		System.out.println("Job salary is 10 LPA");
	}
	
	// can have multiple default methods
	default void jobLocation() {
		System.out.println("Job location is Bangalore");
	}
	
	private static void jobType() {
		System.out.println("Job type is Full Time");
	}
	
	static void jobShift() {
		System.out.println("Job shift is Day Shift");
	}
}
