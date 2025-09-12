package DP;
import java.util.*;

class Solution {
    public List<Integer> largestDivisibleSubset(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums); 

        int[] dp = new int[n];     // dp[i] = length of largest divisible subset ending at i
        int[] hash = new int[n];   // To track previous index for reconstruction

        Arrays.fill(dp, 1);   // Every number alone is a subset of size 1
        for (int i = 0; i < n; i++) hash[i] = i;

        int maxi = 1, lastIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int prev = 0; prev < i; prev++) {
                if (nums[i] % nums[prev] == 0 && 1 + dp[prev] > dp[i]) {
                    dp[i] = 1 + dp[prev];
                    hash[i] = prev;
                }
            }
            if (dp[i] > maxi) {
                maxi = dp[i];
                lastIndex = i;
            }
        }

        // Reconstruct the subset
        List<Integer> ans = new ArrayList<>();
        ans.add(nums[lastIndex]);
        while (hash[lastIndex] != lastIndex) {
            lastIndex = hash[lastIndex];
            ans.add(nums[lastIndex]);
        }

        Collections.reverse(ans);
        return ans;
    }
}
