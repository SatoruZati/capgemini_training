package day5.dp;

public class RodCutting {

    public static void main(String[] args) {

        // price[i] = price of rod of length (i+1)
        int[] price = {2, 5, 7, 8};

        int n = price.length;   // rod length

        // dp[i] = max profit for rod length i
        int[] dp = new int[n + 1];

        // build dp table
        for (int i = 1; i <= n; i++) {

            int max = 0;

            // try all possible cuts
            for (int j = 1; j <= i; j++) {

                max = Math.max(
                        max,
                        price[j - 1] + dp[i - j]
                );
            }

            dp[i] = max;
        }

        System.out.println("Maximum Profit: " + dp[n]);
    }
}