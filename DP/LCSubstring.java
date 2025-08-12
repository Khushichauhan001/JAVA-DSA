package DP;

public class LCSubstring {
    public static int longestCommonSubstr(String s1, String s2) {
        int m = s1.length();
        int n = s2.length();
        int maxLength = 0 ;
        // code here
        int[][] t= new int[m+1][n+1];
        for(int i=0 ; i< m+1;i++){
            for(int j=0 ; j<n+1; j++){
                t[i][j] = 0;
            }
        }
        
        for(int i=1 ;i<m+1 ;i++){
            for(int j=1 ; j<n+1;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                   t[i][j] = 1+t[i-1][j-1];  
                   maxLength = Math.max(maxLength , t[i][j]);
            }
            else {
                t[i][j] = 0 ;
            }
        }
    }
    return maxLength;
}
public static void main(String[] args) {
    String s1 = "ABCDGH";
    String s2 = "ACDGHR";
    System.out.println(longestCommonSubstr(s1, s2));
}
}
