package capgemini_03022026;

public class GreedyAlgo {

	public static void main(String[] args) {
		
		// example of a greedy algorithm: Coin Change Problem
		
		// Coin Change Problem:
		/* Given a set of coin denominations and a target amount,
		 * the goal is to find the minimum number of coins needed to make the target amount.
		 * A greedy approach would be to always choose the largest denomination coin
		 * that is less than or equal to the remaining amount.
		 * 
		 * Coin Denominations: {25, 10, 5, 1}
		 * Target Amount: 30
		 * 
		 * Optimal Solution:
		 * 1. Choose 25 (remaining amount = 5)
		 * 2. Choose 5 (remaining amount = 0)
		 * 
		 * Total Coins Used: 2 (25 + 5)
		 */
		
		int[] denominations = {25, 10, 5, 1};
		int amount = 30;

		int coinCount = 0;
		for (int i = 0; i < denominations.length; i++) {
			while (amount >= denominations[i]) {
				amount -= denominations[i];
				coinCount++;
			}
		}

		System.out.println("Minimum coins needed: " + coinCount);

	}

}
