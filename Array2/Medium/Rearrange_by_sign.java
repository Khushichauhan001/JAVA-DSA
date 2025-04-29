// this is a bruteful approach to solve this 
package Array2.Medium;

import java.util.ArrayList;

public class Rearrange_by_sign {
     public static int[] RearrangeBySign(int[] A , int n){
          ArrayList<Integer> pos = new ArrayList<>();
          ArrayList<Integer> neg = new ArrayList<>();

          for(int i=0;i< n ;i++){
            if(A[i] > 0) pos.add(A[i]);
            else neg.add(A[i]);
          }

          for(int i=0 ; i< n/2 ; i++){
            A[2*i] = pos.get(i);
            A[2*i+1] = neg.get(i);   
          }
          System.out.println();
          return A;
     }
     public static void main(String[] args) {
        int n = 4;
        int A[]= {1,2,-4,-5};
      
      
        int[]ans= RearrangeBySign(A,n);
        
        for (int i = 0; i < n; i++) {
          System.out.print(ans[i]+" ");
        }
     }
}




// if array (nums) is given in place of arraylist then 

// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int n = nums.length;
//         int[] pos = new int[n/2];
//         int[] neg = new int[n/2];

//         int posIndex = 0 ; 
//         int negIndex = 0 ;

//         for(int i=0 ;i<n;i++){
//             if(nums[i] > 0){
//                  pos[posIndex++] = nums[i];
//             }
//             else {
//                 neg[negIndex++] = nums[i];
//             }
//         }

//         for(int i=0 ; i< n/2 ;i++){
//             nums[2*i] = pos[i];
//             nums[2*i+1] = neg[i];
//         }
//         return nums;
//     }
// }







// optimal solution

// public class Rearrange_by_sign {
//     public static int[] alternateNumbers(int []a) {
//         // Write your code here.
//         int n = a.length;
//         int[] ans = new int[n];
//          int posIndex = 0, negIndex = 1;
//         for (int i = 0; i < n; i++) {
//            if(a[i] < 0){
//               ans[negIndex] = a[i];
//               negIndex+=2 ;
//            }
//            else {
//              ans[posIndex] = a[i];
//              posIndex+=2 ;   
//            }
//         }
//         return ans ;
//     }
// }