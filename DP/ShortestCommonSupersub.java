package DP;

public class ShortestCommonSupersub {
    public static String shortestCommonSupersequence(String str1, String str2) {
        int m = str1.length();
        int n = str2.length();
        int[][] t = new int[m+1][n+1];

        for(int i= 0 ;i<=m ; i++){
            t[i][0] = 0 ;
        }
        for(int j=0 ; j<=n ;j++){
            t[0][j] = 0 ;
        }

        for(int i=1 ; i<=m ;i++){
            for(int j=1 ; j<=n ;j++){
                if(str1.charAt(i-1) == str2.charAt(j-1)){
                    t[i][j] = 1+t[i-1][j-1];
                }
                else {
                    t[i][j] = 0+ Math.max(t[i-1][j] , t[i][j-1]);
                }
            }
        }

        // int len = t[m][n];
        int i=m;
        int j= n ;
          StringBuilder ans = new StringBuilder();


        // int ind = len -1;
        // String ans = "";

        while(i>0 && j>0){
            if(str1.charAt(i-1) == str2.charAt(j-1)){
                ans.append(str1.charAt(i-1));
             
                i--;
                j--;
            }
            else if(t[i-1][j] > t[i][j-1]){
                ans.append(str1.charAt(i-1));
                i--;

            }
            else {
                ans.append(str2.charAt(j-1));
                j--;
            }
        }
        while(i>0){
            ans.append(str1.charAt(i-1));
            i--;
        }
        while(j>0){
            ans.append(str2.charAt(j-1));
            j--;
        }

         return ans.reverse().toString();

      
    }
    public static void main(String[] args) {
        
         String s1 = "brute";
         String s2 = "groot";
         System.out.println(shortestCommonSupersequence(s1, s2));
    }
}
