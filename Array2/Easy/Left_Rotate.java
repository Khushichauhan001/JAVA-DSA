// array left rotation ,... uper part passes all the test cases bs main function m dikkt aarhi h 
package Array2.Easy;

import java.util.* ;
import java.io.*; 


public class Left_Rotate {
      
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];
        for(int i = 1 ; i<n;i++){
            arr[i-1] = arr[i];
        }
        arr[n-1] = temp ;
        return arr ;
     }
    //  public static void main(String[] args) {
    //     int[] arr = {1,2,3,4,5};
    //     int n = 5;
    //     System.out.println(rotateArray(arr, n));
        
    //  }
     
}