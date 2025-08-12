package DP;

public class MinInsertion {
    public static int minInsertions(String s) {
        int n = s.length() ;
        int k = longestPalindromeSubseq(s);
        return n-k ;
    }
    public static int longestPalindromeSubseq(String s) {

        String s2 = new StringBuilder(s).reverse().toString();
        return helper(s , s2);
    }
    private static int helper(String s1 , String s2){
        int m = s1.length();
        int n = s2.length();

        int[][] t = new int[m+1][n+1];

        for(int i=0 ; i<= m ;i++){
            for(int j=0 ; j<=n ;j++){
                if(i==0 || j== 0){
                    t[i][j] = 0 ;
                }
                else {
                    if(s1.charAt(i-1) == s2.charAt(j-1)){
                        t[i][j] = 1+ t[i-1][j-1];
                    }
                    else {
                        t[i][j] = 0+Math.max(t[i-1][j] , t[i][j-1]);
                    }
                }
            }
        }
                return  t[m][n];
    }
}
