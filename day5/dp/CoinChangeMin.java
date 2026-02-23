package day5.dp;

public class CoinChangeMin {

    public static void main(String[] args) {

        int[] coins = {1, 2, 5};
        int amount = 11;

        // dp[i] = minimum coins to make amount i
        int[] dp = new int[amount + 1];

        // initialize with large value
        for (int i = 1; i <= amount; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        dp[0] = 0; // base case

        // build dp table
        for (int i = 1; i <= amount; i++) {

            for (int coin : coins) {

                // check if coin can be used
                if (coin <= i && dp[i - coin] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(
                            dp[i],
                            1 + dp[i - coin]
                    );
                }
            }
        }

        System.out.println("Minimum coins required: " + dp[amount]);
    }
}