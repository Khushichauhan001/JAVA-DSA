package DP;

public class DeleteOpera {
    public static int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] t = new int[m+1][n+1];
        for(int i=0 ; i<=m; i++){
            for(int j=0 ; j<= n ;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }
                else{
                    if(word1.charAt(i-1) == word2.charAt(j-1)){
                        t[i][j] = 1+ t[i-1][j-1];
                    }
                    else {
                        t[i][j] = 0+ Math.max(t[i-1][j] , t[i][j-1]);
                    }
                }
            }
        }

        int LcsLength = t[m][n] ;
        return (m+n) - (2*LcsLength);
    }

    public static void main(String[] args) {
        String s1 = "brute";
        String s2 = "groot";
        System.out.println(minDistance(s1, s2));   // 6
    }
}
