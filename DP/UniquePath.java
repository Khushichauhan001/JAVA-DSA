package DP;

public class UniquePath {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for(int i=0 ;i<m;i++){
            for(int j=0 ;j< n;j++){
                if(i==0 || j==0){
                    dp[i][j] = 1 ;
                }
                else {
                    dp[i][j] = dp[i][j-1] + dp[i-1][j];
                }
            }
        }
        return dp[m-1][n-1];
    }
}



// optimized one 
// class Solution {
//     public int uniquePaths(int m, int n) {
//         int[] dp = new int[n];
        
//         // First row: only one way to reach each cell
//         for (int j = 0; j < n; j++) {
//             dp[j] = 1;
//         }
        
//         // Process remaining rows
//         for (int i = 1; i < m; i++) {
//             for (int j = 1; j < n; j++) {
//                 dp[j] = dp[j] + dp[j-1];
//             }
//         }
        
//         return dp[n-1];
//     }
// }
