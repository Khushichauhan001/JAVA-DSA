// this is the optimal approach 
// package Array2.Easy;

//Two pointers approach 

// public class Move_Zero{
//     public static int[] moveZeroes(int[] nums) {
//         int n = nums.length;
//         int j = -1;
//         for(int i = 0 ; i<n ; i++){
//             if(nums[i] == 0 ){
//                 j = i ; 
//                 break;
//             }
//         }

//         if (j == -1) {
//             return nums;
//         }

//          for(int i = j+1; i<n;i++){
//             if(nums[i] != 0 ){
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp ;
//                j++;
//             }
//          } 
//         return nums ;
//     }
//     public static void main(String[] args) {
//         int[] nums = { 1,0,2,0,3,5,7,0,4};
//           int n = nums.length;
//           int[] ans = moveZeroes(nums);
//           for(int i = 0 ; i<n ;i++){
//             System.out.print(nums[i]+ " ");

//           }
//           System.out.println(" ");
          

//     }
// }


// now bruteful approach 
package Array2.Easy;

import java.util.ArrayList;

public class Move_Zero{
        public static int[] moveZeros(int n, int[] a) {
            ArrayList<Integer> temp = new ArrayList<>();
            // for storig non zero elements into temp 
            for(int i = 0 ; i<n;i++){
                if(a[i]!= 0 ){
                    temp.add(a[i]);
                }
            }

                int nz = temp.size();

            for(int i = 0 ; i< nz; i++){
                a[i] = temp.get(i);
            }

            for(int i = nz ; i<n ;i++){
                a[i] = 0 ;
            }
            return a ;
            
    }
        public static void main(String[] args) {
            int[] a = {1, 0, 2, 3, 2, 0, 0, 4, 5, 1};
            int n = 10;
            int[] ans = moveZeros(n, a);
            for (int i = 0; i < n; i++) {
                System.out.print(ans[i] + " ");
            }
            System.out.println("");
    }
}