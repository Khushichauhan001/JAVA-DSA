package DP;

import java.util.Arrays;
import java.util.List;

// DP+ MEmoization (but show TLE)
public class Triangle {
     public int minimumTotal(List<List<Integer>> triangle) {
        int n = triangle.size();
        int[][]  dp = new int[n][n];
        for(int[] rows: dp){
            Arrays.fill(rows , -1);

        }
        return helper(triangle , 0 , 0 , dp , n );

    }
    static int helper(List<List<Integer>> triangle , int i , int j , int[][] dp , int n){
        if(dp[i][j] != -1){
            return dp[i][j];
        }
        if( i == n-1){
            return triangle.get(i).get(j);
        }

        int down = triangle.get(i).get(j) + helper(triangle , i+1 , j, dp , n);
        int diagonal = triangle.get(i).get(j) + helper(triangle , i+1 , j+1 ,dp , n);

        return dp[i][j] = Math.min(down , diagonal);
    }
}



//optimized 

// class Solution {
//     public int minimumTotal(List<List<Integer>> triangle) {
//         int n = triangle.size();
//         int[] dp = new int[n];
//         for (int j = 0; j < n; j++) {
//             dp[j] = triangle.get(n - 1).get(j);
//         }
//         for (int i = n - 2; i >= 0; i--) {
//             for (int j = 0; j <= i; j++) {
//                 dp[j] = triangle.get(i).get(j) + Math.min(dp[j], dp[j + 1]);
//             }
//         }

//         return dp[0];
//     }
// }
