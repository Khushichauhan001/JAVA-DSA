package DP;

public class MinSubsetSum {
  
    public static int minDifference(int arr[]) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        int n = arr.length;
        boolean[][] dp = new boolean[n + 1][sum + 1];

        // Initialize the dp array
        for (int i = 0; i <= n; i++) {
            dp[i][0] = true; // sum = 0 is always possible
        }

        // Fill the dp table
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= sum; j++) {
                if (arr[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i - 1]];
                }
            }
        }

        // Find the minimum difference
        int min = Integer.MAX_VALUE;
        for (int j = 0; j <= sum / 2; j++) {
            if (dp[n][j]) {
                min = Math.min(min, Math.abs((sum - j) - j));
            }
        }

        return min;
    }
    public class Main {
        public static void main(String[] args) {
            int[] arr = {1, 6, 11, 5};
            System.out.println(minDifference(arr)); // Output should be 1
        }
    }
    
}
