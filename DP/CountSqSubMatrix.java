package DP;

// tc: 0(m*n)   sc: 0(m*n)

public class CountSqSubMatrix {
    public int countSquares(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length ;
        int[][] dp = new int[m][n];
         int total =0 ;
         int v =0;
        for(int i=0 ;i<m;i++){
            for(int j=0 ;j<n;j++){
                if(matrix[i][j] == 1){
                if(i==0 || j==0){
                    dp[i][j] = 1;
                }
                else {
                    dp[i][j]  = 1 + Math.min(dp[i-1][j] , Math.min(dp[i][j-1], dp[i-1][j-1]));
                }
                total += dp[i][j];
            }
            }
        }
        return total;
    }
}



// Why total += dp[i][j]?

// Because every dp[i][j] tells us:
//  "How many squares end at this cell?"
// And adding all of them gives the total squares in the matrix.




//optimized (1d space) sc: 0(n)

// class Solution {
//     public int countSquares(int[][] matrix) {
//         int m = matrix.length, n = matrix[0].length;
        
//         int[] prev = new int[n];   // previous row
//         int[] curr = new int[n];   // current row
//         int total = 0;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {
//                 if (matrix[i][j] == 1) {
//                     if (i == 0 || j == 0) {
//                         curr[j] = 1; // first row/col
//                     } else {
//                         curr[j] = 1 + Math.min(prev[j], 
//                                        Math.min(curr[j-1], prev[j-1]));
//                     }
//                     total += curr[j];
//                 } else {
//                     curr[j] = 0; // reset if matrix[i][j] == 0
//                 }
//             }
//             // move curr row into prev for next iteration
//             prev = curr.clone();
//         }
//         return total;
//     }
// }
