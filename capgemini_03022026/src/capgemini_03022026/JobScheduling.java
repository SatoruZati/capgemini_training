//  JOB SCHEDULING PROBLEM USING GREEDY ALGORITHM
		
// example: Given a set of jobs with deadlines and profits,
// the goal is to schedule the jobs in such a way that maximizes 
// the total profit

		/* Jobs: 
		 * Job1: deadline=2, profit=100
		 * Job2: deadline=1, profit=19
		 * Job3: deadline=2, profit=27
		 * Job4: deadline=1, profit=25
		 * Job5: deadline=3, profit=15
		 * 
		 * Optimal Job Scheduling:
		 * Time Slot 1: Job1 (profit=100)
		 * Time Slot 2: Job3 (profit=27)
		 * Time Slot 3: Job5 (profit=15)
		 * 
		 * Total Profit = 100 + 27 + 15 = 142
		 */
// Rules:
// 1. Sort jobs in descending order of profit
// 2. Iterate through the sorted jobs and assign them to the latest available time slot
// 3. If a job cannot be assigned to its deadline, discard it
// 4. Continue until all jobs are processed or all time slots are filled
// 5. The result is the maximum profit that can be achieved with the given jobs and deadlines
		
		

package capgemini_03022026;

public class JobScheduling {
	
	public static class Job {
		// should we use int or Integer?
		// Using 'int' is sufficient here since we are not dealing with null values.
		// Using 'Integer' would be necessary if we needed to represent the absence of a value (null).
		// Both are acceptable, but 'int' is more efficient for this use case.
		
		// int or String for id?
		// Using 'int' for id is appropriate here since job IDs are typically numeric 
		// and we are not dealing with alphanumeric identifiers.
		int id;
		int deadline;
		int profit;
		
		public Job(int id, int deadline, int profit) {
			this.id = id;
			this.deadline = deadline;
			this.profit = profit;
		}
	}

	public static void main(String[] args) {
		
		Job[] jobs = {
			new Job(1, 2, 100),
			new Job(2, 1, 19),
			new Job(3, 2, 27),
			new Job(4, 1, 25),
			new Job(5, 3, 15)
		};
		
		// Sort jobs by profit in descending order
		// lambda expression used here: (b, a) -> b.profit - a.profit
		// why use lambda expression here? because it provides a 
		// concise way to define the comparison logic
		
		// what does lambda expression do here?
		// It defines a custom sorting order for the job objects based on their profit.
		// how does it work? It compares two job objects and returns a negative value,
		// zero, or a positive value depending on the profit comparison.
		java.util.Arrays.sort(jobs, (a, b) -> b.profit - a.profit);
		// explanation of above line:
		// .sort() is a static method from the Arrays class in java.util package
		// It sorts the array 'jobs' using the provided comparator
		// jobs, (a, b) -> b.profit - a.profit is the comparator
		// where (a, b) are two job objects being compared
		// and -> is the lambda operator that separates the parameters from the body of the function
		// and b.profit - a.profit is the body that defines the sorting logic
		
		int n = jobs.length;
		int maxDeadline = 0;
		
		// explanation of the below loop:
		// for each job in the jobs array, 
		// check if its deadline is greater than the current maxDeadline
		for (Job job : jobs) {
			if (job.deadline > maxDeadline) {
				maxDeadline = job.deadline;
			}
		}
		
		// explanation of the below code:
		// Create a boolean array 'slot' of size maxDeadline to keep track of occupied time slots
		// new boolean[maxDeadline] initializes all slots to false (unoccupied)
		boolean[] slot = new boolean[maxDeadline];
		int totalProfit = 0;
		
		for (Job job : jobs) {
			// explanation of the below loop:
			// Iterate from the minimum of maxDeadline and job.deadline - 1 down to 0
			// Math.min(maxDeadline, job.deadline) - 1 gives the latest possible slot for the job
			
			// if the slot is unoccupied (false), assign the job to that slot
			// i.e. !slot[j] is true, mark it as occupied (true) and add the job's profit to totalProfit
			// The 'break' statement ensures that we stop checking earlier slots once we find a free one
			
			for (int j = Math.min(maxDeadline, job.deadline) - 1; j >= 0; j--) {
				if (!slot[j]) {
					slot[j] = true;
					totalProfit += job.profit;
					break;
				}
			}
		}
		
		System.out.println("Total Profit: " + totalProfit);

	}

}
