package Array2.Medium;
// import java.util.Collections;

import java.util.Arrays;

public class printLeaderBrute{
    public static int[] printLeadersBruteForce(int[] arr, int n) {
        int[] ans = new int[n];
        int index = 0 ;
        for(int i=0 ; i<n;i++){
            boolean isLeader = true ;
          for(int j= i+1 ; j<n ;j++){
            if(arr[i] < arr[j]){
                isLeader = false ; 
                break ;
            }
            
          }
          if(isLeader){
            ans[index] = arr[i];
            index++ ; 
          }
        
        
        }
        return Arrays.copyOf(ans, index);
    }
        
    public static void main(String args[]) {
        // Array Initialization
        int n = 6;
        int arr[] = {10, 22, 12, 3, 0, 6};

        int[] ans = printLeadersBruteForce(arr, n);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
        System.out.println();
    }

         
    
}