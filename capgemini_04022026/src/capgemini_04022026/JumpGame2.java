/* Jump Game II 

given an integer array nums where each element represents the maximum jump length you can move forward from that position. You start at index 0 
and your goal is to reach the last index in the minimum number of jumps.
Each jump can move you forward by at most nums[i] steps from index i. 
Return the minimum number of jumps required to reach the last index. It is guaranteed that the last index You are is always reachable. 

Input 
nums = [2,3,1,1,4] 

Output 
2 

Constraints 
1 ≤ nums.length ≤ 10⁴ 
0 ≤ nums[i] ≤ 1000 
*/


package capgemini_04022026;

public class JumpGame2 {
	
	public int jumpGame2(int[] nums) {
		int jumps = 0; // Number of jumps made
		int currentEnd = 0; // The farthest point that can be reached with the current number of jumps
		int farthest = 0; // The farthest point that can be reached with one more jump

		for (int i = 0; i < nums.length - 1; i++) {
			farthest = Math.max(farthest, i + nums[i]); // Update the farthest point reachable

			// If we have reached the end of the current jump
			if (i == currentEnd) {
				jumps++; // Make a jump
				currentEnd = farthest; // Update the end to the farthest point reached

				// If we have reached or exceeded the last index, break
				if (currentEnd >= nums.length - 1) {
					break;
				}
			}
		}

		return jumps;
	}

	public static void main(String[] args) {
		// Test the jumpGame2 function
		int[] nums = {2, 3, 1, 1, 4};
		int result = jumpGame2(nums);
		System.out.println("Minimum number of jumps to reach the last index: " + result); // Output: 2

	}

}
