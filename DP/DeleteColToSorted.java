package DP;

public class DeleteColToSorted {
  public  static int minDeletionSize(String[] strs) {
        int n = strs.length ;
        int m = strs[0].length() ;
        int[]  dp = new int[m];
        int maxKeep =0;
        for(int j=0;j<m ;j++){
            dp[j] = 1 ;
            for(int i=0 ;i< j ;i++){
                if(isValid(i ,j , strs)){
                    dp[j] = Math.max(dp[j] , dp[i]+1);
                }
            }
            maxKeep = Math.max(dp[j] , maxKeep);
        }
        return m  - maxKeep ;
    }

    private static boolean isValid(int i , int j , String[] strs){
       for( String s : strs){
        if(s.charAt(i) > s.charAt(j)){
            return false ;
        }
       }
       return true ;
    }

    public static void main(String[] args) {
         String[] strs1 = {"babca", "bbazb"};
        System.out.println(minDeletionSize(strs1));
    }
}