package day5.greedy;

class JobScheduling {

    // Job class to store job details
    static class Job {
        char id;        // Job name (A, B, C...)
        int deadline;   // Deadline of job
        int profit;     // Profit of job

        Job(char id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {

        // Step 1: Create jobs
        Job[] jobs = {
                new Job('A', 2, 100),
                new Job('B', 1, 19),
                new Job('C', 2, 27),
                new Job('D', 1, 25),
                new Job('E', 3, 15)
        };

        // Step 2: Sort jobs by profit (descending)
        for (int i = 0; i < jobs.length - 1; i++) {
            for (int j = i + 1; j < jobs.length; j++) {
                if (jobs[i].profit < jobs[j].profit) {
                    Job temp = jobs[i];
                    jobs[i] = jobs[j];
                    jobs[j] = temp;
                }
            }
        }

        // Step 3: Find maximum deadline
        int maxDeadline = 0;
        for (Job job : jobs) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        // Step 4: Create time slots (false = empty)
        boolean[] slot = new boolean[maxDeadline];

        // Store job sequence
        char[] result = new char[maxDeadline];

        // Step 5: Schedule jobs
        for (Job job : jobs) {

            // Check slots from job.deadline - 1 backwards
            for (int j = job.deadline - 1; j >= 0; j--) {

                // If slot is empty
                if (!slot[j]) {
                    slot[j] = true;       // Mark slot as filled
                    result[j] = job.id;  // Store job id
                    break;
                }
            }
        }

        // Step 6: Print scheduled jobs
        System.out.println("Job sequence for maximum profit:");
        for (int i = 0; i < result.length; i++) {
            if (slot[i]) {
                System.out.print(result[i] + " ");
            }
        }
    }
}