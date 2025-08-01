package DP;

import java.util.Arrays;


//memoization 
public class EditDistance {
     private int helper(String s1 , String s2 , int i , int j , int[][] dp ){
    if(i < 0) return j+1;
    if(j<0) return i+1;
    if(dp[i][j] != -1){
        return dp[i][j];
    }
    if(s1.charAt(i) == s2.charAt(j)) 
      return dp[i][j] = helper(s1 , s2 , i-1 , j-1, dp);
    else
     return dp[i][j] = 1+ Math.min(helper(s1 , s2 , i-1 ,  j-1 , dp),Math.min(helper(s1,s2,i-1, j, dp), helper(s1,s2,i,j-1 , dp)));
    }
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m+1][n+1];
        for(int[] rows : dp){
            Arrays.fill(rows, -1);
        }
        return helper(word1, word2 , m-1 , n-1, dp );
    }
}



// rest tabulation show fr striver




// space optmization 



// public class EditDistance {
       
//     public int minDistance(String word1, String word2) {
//         int m = word1.length();
//         int n = word2.length();

//     int[] prev = new int[n+1];
//     int[] curr = new int[n+1];
//         int[][] dp = new int[m+1][n+1];
        
//         for(int j=0 ; j<=n ;j++){
//             prev[j] = j ;
//         }

//         for(int i=1 ; i<=m ; i++){
//             curr[0] = i ;
//             for(int j=1 ; j<= n ;j++){
//             if(word1.charAt(i-1) == word2.charAt(j-1)) 
//             curr[j] = prev[j-1];
//             else
//                 curr[j] = 1+ Math.min(prev[j-1],Math.min(prev[j], curr[j-1]));
//             }
//             // prev = curr.clone();
//               int[] temp = prev;
//         prev = curr;
//         curr = temp;
//             }

//         return prev[n];
//         }
// }