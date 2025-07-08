package DP;

public class Subsetsum {
    public static Boolean isSubsetSum(int arr[], int sum) {
        // code here
     int n = arr.length ;
     boolean[][] t = new boolean[n+1][sum+1];
     
     for(int i=0 ; i<=n ; i++){
         t[i][0] = true ;
     }
     
     for(int  i=1;i<=n;i++){
         for(int j=1 ; j<=sum ;j++){
             if(arr[i-1]> j){
                 t[i][j] = t[i-1][j];
             }
             else {
                 t[i][j] = t[i-1][j] || t[i-1][j -arr[i-1]] ;
             }
         }
     }
     return t[n][sum];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        int sum = 9 ;
        System.out.println(isSubsetSum(arr, sum));
    }
}
