package day5.dp;

public class Knapsack01 {

    public static void main(String[] args) {

        // weights of items
        int[] weight = {1, 2, 3};

        // values of items
        int[] value = {10, 15, 40};

        int capacity = 5;              // knapsack capacity
        int n = weight.length;         // number of items

        // DP table
        int[][] dp = new int[n + 1][capacity + 1];

        // Build the DP table
        for (int i = 1; i <= n; i++) {           // for each item
            for (int w = 1; w <= capacity; w++) { // for each capacity

                // if current item weight is more than capacity
                if (weight[i - 1] > w) {
                    dp[i][w] = dp[i - 1][w];     // cannot take item
                } else {
                    // take max of taking or not taking
                    dp[i][w] = Math.max(
                            dp[i - 1][w],                           // not take
                            value[i - 1] + dp[i - 1][w - weight[i - 1]] // take
                    );
                }
            }
        }

        // final answer
        System.out.println("Maximum value: " + dp[n][capacity]);
    }
}